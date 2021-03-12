package id.rosyid.topartists.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Song(
    var title: String = "",
    var duration: String = "",
    var image: Int = 0,
    var linkSpotify: String = "",
    var linkYoutube: String = ""
) : Parcelable
