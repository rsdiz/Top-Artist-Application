package id.rosyid.topartists.utils

import id.rosyid.topartists.data.Song

object SearchSong {
    fun byTitle(data: ArrayList<Song>, title: String): List<Song> {
        return data.filter { it.title == title }
    }
}
