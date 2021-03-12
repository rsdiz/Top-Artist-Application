package id.rosyid.topartists.ui.main.artists.detail

import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Album
import id.rosyid.topartists.utils.Const
import id.rosyid.topartists.utils.PreferenceHelper

class GridAlbumsAdapter(
    private val listAlbum: ArrayList<Album>,
    private val clickListener: (Album) -> Unit,
    private val toggleListener: (SharedPreferences, ToggleButton, String) -> Unit
) : RecyclerView.Adapter<GridAlbumsAdapter.GridViewHolder>() {
    private lateinit var mPreferences: SharedPreferences
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        mPreferences = PreferenceHelper.customPrefs(parent.context, Const.FAVORITE)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_album, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bind(listAlbum[position], clickListener, toggleListener)
    }

    override fun getItemCount(): Int {
        return listAlbum.size
    }

    inner class GridViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val ivAlbumImage = view.findViewById<ImageView>(R.id.album_image)
        private val tvAlbumName = view.findViewById<TextView>(R.id.album_name)
        private val tvAlbumReleaseDate = view.findViewById<TextView>(R.id.album_release_date)
        private val tvAlbumContainer = view.findViewById<ConstraintLayout>(R.id.album_container)
        private val tbFavoriteToggle = view.findViewById<ToggleButton>(R.id.tb_favorite)

        fun bind(
            album: Album,
            clickListener: (Album) -> Unit,
            toggleListener: (SharedPreferences, ToggleButton, String) -> Unit
        ) {
            Glide.with(view.rootView.context)
                .load(album.albumCover)
                .centerCrop()
                .into(ivAlbumImage)
            tvAlbumName.text = album.name
            tvAlbumReleaseDate.text = album.releaseDate.toString()
            tvAlbumContainer.setOnClickListener {
                clickListener(album)
            }
            toggleListener(mPreferences, tbFavoriteToggle, album.name)
        }
    }
}
