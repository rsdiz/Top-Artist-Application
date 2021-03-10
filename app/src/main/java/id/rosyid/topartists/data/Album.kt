package id.rosyid.topartists.data

import java.time.LocalDate

data class Album(
    var title: String = "",
    var releaseDate: LocalDate = LocalDate.MIN,
    var songs: ArrayList<Song> = arrayListOf(),
    var duration: String = ""
)
