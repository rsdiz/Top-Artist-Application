package id.rosyid.topartists.data

data class Artist(
    var name: String = "",
    var genres: ArrayList<Genre> = arrayListOf(),
    var bio: String = "",
    var albums: ArrayList<Album> = arrayListOf(),
    var profileImage: Int = 0,
    var monthlyListener: Long = 0L
)
