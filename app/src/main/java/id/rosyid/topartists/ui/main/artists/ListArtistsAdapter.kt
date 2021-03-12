package id.rosyid.topartists.ui.main.artists

import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Artist
import id.rosyid.topartists.utils.Const
import id.rosyid.topartists.utils.PreferenceHelper

class ListArtistsAdapter(
    private val listArtist: ArrayList<Artist>,
    private val clickListener: (Artist) -> Unit,
    private val toggleListener: (SharedPreferences, ToggleButton, String) -> Unit,
    private val incrementBy: Int
) : RecyclerView.Adapter<ListArtistsAdapter.ListViewHolder>() {
    private lateinit var mPreferences: SharedPreferences
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        mPreferences = PreferenceHelper.customPrefs(parent.context, Const.FAVORITE)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_artist_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listArtist[position], position, clickListener, toggleListener)
    }

    override fun getItemCount(): Int {
        return listArtist.size
    }

    inner class ListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val tvArtistName = view.findViewById<TextView>(R.id.artist_name)
        private val tvArtistMonthlyListener = view.findViewById<TextView>(R.id.artist_monthly_listener)
        private val ivArtistImage = view.findViewById<ImageView>(R.id.artist_image)
        private val tvRankNumber = view.findViewById<TextView>(R.id.rank_number)
        private val tbFavoriteArtist = view.findViewById<ToggleButton>(R.id.tb_favorite)

        fun bind(
            artist: Artist,
            position: Int,
            clickListener: (Artist) -> Unit,
            toggleListener: (SharedPreferences, ToggleButton, String) -> Unit
        ) {
            tvRankNumber.text = (position + incrementBy).toString()
            tvArtistName.text = artist.name
            tvArtistMonthlyListener.text = FormatNumberListener.format(artist.monthlyListener)
            Glide.with(view.rootView.context)
                .load(artist.profileImage)
                .centerCrop()
                .into(ivArtistImage)
            view.rootView.setOnClickListener {
                clickListener(artist)
            }
            toggleListener(mPreferences, tbFavoriteArtist, artist.name)
        }
    }
}
