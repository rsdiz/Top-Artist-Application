package id.rosyid.topartists.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class Album(
    var name: String = "",
    var releaseDate: LocalDate = LocalDate.MIN,
    var songs: ArrayList<Song> = arrayListOf(),
    var duration: String = "",
    var albumCover: Int = 0
) : Parcelable
