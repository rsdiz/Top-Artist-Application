package id.rosyid.topartists.utils

import android.content.Context
import android.content.Intent
import androidx.core.os.bundleOf
import id.rosyid.topartists.data.Album
import id.rosyid.topartists.ui.main.artists.detail.ListSongsActivity

class AlbumListener(private val context: Context) : RecyclerViewAlbumListener() {
    override lateinit var selectedAlbum: Album
    override lateinit var artistName: String

    override fun onItemClick() {
        val intent = Intent(context, ListSongsActivity::class.java)
        val bundle = bundleOf(
            Const.ARTIST_NAME to artistName,
            Const.ALBUM_TITLE to selectedAlbum.name,
            Const.ALBUM_RELEASE_DATE to selectedAlbum.releaseDate,
            Const.ALBUM_DURATION to selectedAlbum.duration,
            Const.ALBUM_COVER to selectedAlbum.albumCover
        )
        bundle.putParcelableArrayList(Const.ARTIST_SONG, selectedAlbum.songs)

        intent.putExtras(bundle)
        context.startActivity(intent)
    }
}
