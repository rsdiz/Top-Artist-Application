package id.rosyid.topartists.utils

import id.rosyid.topartists.data.Album

object SearchAlbum {
    fun byName(data: ArrayList<Album>, name: String): List<Album> {
        return data.filter { it.name == name }
    }
}