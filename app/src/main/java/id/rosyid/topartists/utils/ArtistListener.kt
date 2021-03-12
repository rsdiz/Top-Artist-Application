package id.rosyid.topartists.utils

import android.content.Context
import android.content.Intent
import androidx.core.os.bundleOf
import id.rosyid.topartists.data.Artist
import id.rosyid.topartists.ui.main.artists.detail.DetailArtistActivity

class ArtistListener(private val context: Context) : RecyclerViewArtistListener() {
    override lateinit var selectedArtist: Artist

    override fun onItemClick() {
        val intent = Intent(context, DetailArtistActivity::class.java)
        val bundle = bundleOf(
            Const.ARTIST_NAME to selectedArtist.name,
            Const.ARTIST_BIO to selectedArtist.bio,
            Const.ARTIST_MONTHLY_LISTENER to selectedArtist.monthlyListener,
            Const.ARTIST_IMAGE to selectedArtist.profileImage
        )
        bundle.putParcelableArrayList(Const.ARTIST_GENRE, selectedArtist.genres)
        bundle.putParcelableArrayList(Const.ARTIST_ALBUMS, selectedArtist.albums)

        intent.putExtras(bundle)
        context.startActivity(intent)
    }
}
