package id.rosyid.topartists.ui.main.artists

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ToggleButton
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Artist
import id.rosyid.topartists.data.ArtistsData
import id.rosyid.topartists.ui.main.artists.detail.DetailArtistActivity
import id.rosyid.topartists.utils.*
import id.rosyid.topartists.utils.PreferenceHelper.set

/**
 * A simple [Fragment] subclass.
 * Use the [ArtistsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ArtistsFragment : Fragment() {

    private val drawableCrossFade =
        DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()
    private var data = ArtistsData.listData
    private lateinit var mPreference: SharedPreferences
    private lateinit var recyclerViewListener: RecyclerViewListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPreference = PreferenceHelper.customPrefs(requireContext(), Const.FAVORITE)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artists, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Check if is first time open app
        if (mPreference.getBoolean(Const.IS_FIRST_TIME, false)) {
            mPreference[Const.IS_FIRST_TIME] = false
            data.forEach { artist ->
                mPreference[artist.name] = false
                artist.albums.forEach { album ->
                    mPreference[album.name] = false
                    album.songs.forEach { song ->
                        mPreference[song.title] = false
                    }
                }
            }
        }

        // Setup Mostly Streamed Artist
        val topArtist = getTopArtist()

        val topArtistImage = view.findViewById<ImageView>(R.id.artist_image_r1)
        val topArtistName = view.findViewById<TextView>(R.id.artist_name_r1)
        val topArtistMonthlyListener = view.findViewById<TextView>(R.id.artist_monthly_listener_r1)
        val topArtistContainer = view.findViewById<LinearLayout>(R.id.artist_number_one)
        val topArtistFavorite = view.findViewById<ToggleButton>(R.id.tb_favorite)

        InitFavoriteToggle.set(mPreference, topArtistFavorite, topArtist.name,)
        topArtistName.text = topArtist.name
        topArtistMonthlyListener.text = FormatNumberListener.format(topArtist.monthlyListener)
        Glide.with(this)
            .load(topArtist.profileImage)
            .transition(withCrossFade(drawableCrossFade))
            .centerCrop()
            .into(topArtistImage)
        topArtistContainer.setOnClickListener {
            recyclerViewListener = ArtistListener(requireContext()).apply {
                this.selectedArtist = topArtist
            }
            recyclerViewListener.onItemClick()
        }

        data.remove(topArtist)
        val artistsAdapter = ListArtistsAdapter(
            data,
//            { selectedArtist: Artist -> onItemClicked(selectedArtist) },
            { selectedArtist: Artist ->
                recyclerViewListener = ArtistListener(requireContext()).also {
                    it.selectedArtist = selectedArtist
                }
                recyclerViewListener.onItemClick()
            },
            { mPreference: SharedPreferences, toggleButton: ToggleButton, artistName: String ->
                InitFavoriteToggle.set(
                    mPreference,
                    toggleButton,
                    artistName
                )
            },
            2
        )
        artistsAdapter.notifyDataSetChanged()

        // Setup RecyclerView after Top Artist
        val rvArtistLists = view.findViewById<RecyclerView>(R.id.rv_top_artist)
        rvArtistLists.setHasFixedSize(true)
        rvArtistLists.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL,
            false
        )
        rvArtistLists.addItemDecoration(
            CustomDividerItemDecoration(
                rvArtistLists.context,
                DividerItemDecoration.VERTICAL
            )
        )
        rvArtistLists.adapter = artistsAdapter
    }

    private fun getTopArtist(): Artist = SortArtistsByMonthlyListener.desc(data).first()

    companion object {
        @JvmStatic
        fun newInstance() = ArtistsFragment()
    }
}
