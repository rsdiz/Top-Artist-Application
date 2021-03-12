package id.rosyid.topartists.ui.main.artists.detail

import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Song
import id.rosyid.topartists.utils.Const
import id.rosyid.topartists.utils.IntentUri
import id.rosyid.topartists.utils.PreferenceHelper

class ListSongAdapter(
    private val dataSong: ArrayList<Song>,
    private val toggleListener: (SharedPreferences, ToggleButton, String) -> Unit
) : RecyclerView.Adapter<ListSongAdapter.ListViewHolder>() {
    private lateinit var mPreferences: SharedPreferences
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        mPreferences = PreferenceHelper.customPrefs(parent.context, Const.FAVORITE)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(dataSong[position], position, toggleListener)
    }

    override fun getItemCount(): Int {
        return dataSong.size
    }

    inner class ListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val ivSongImageView: ImageView = view.findViewById(R.id.song_image_cover)
        private val tvSongTitle: TextView = view.findViewById(R.id.song_title)
        private val tvSongDuration: TextView = view.findViewById(R.id.song_duration)
        private val btnYoutube: ImageButton = view.findViewById(R.id.button_open_youtube)
        private val btnSpotify: ImageButton = view.findViewById(R.id.button_open_spotify)
        private val tvNumberPosition: TextView = view.findViewById(R.id.song_number)
        private val tbFavoriteToggle: ToggleButton = view.findViewById(R.id.tb_favorite)

        fun bind(
            song: Song,
            position: Int,
            toggleListener: (SharedPreferences, ToggleButton, String) -> Unit
        ) {
            Glide.with(view.rootView.context)
                .load(song.image)
                .into(ivSongImageView)
            tvSongTitle.text = song.title
            tvSongDuration.text = "Duration: ${song.duration}"
            tvNumberPosition.text = (position + 1).toString()
            btnYoutube.setOnClickListener {
                view.context.startActivity(IntentUri.open(song.linkYoutube))
            }
            btnSpotify.setOnClickListener {
                view.context.startActivity(IntentUri.open(song.linkSpotify))
            }
            toggleListener(mPreferences, tbFavoriteToggle, song.title)
        }
    }
}
