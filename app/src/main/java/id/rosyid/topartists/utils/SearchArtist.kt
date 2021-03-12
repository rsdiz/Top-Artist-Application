package id.rosyid.topartists.utils

import id.rosyid.topartists.data.Artist
import id.rosyid.topartists.data.Genre

object SearchArtist {
    fun byName(data: ArrayList<Artist>, name: String): List<Artist> {
        return data.filter { it.name == name }
    }

    fun byGenre(data: ArrayList<Artist>, genre: Genre): List<Artist> {
        return data.filter { it.genres.contains(genre) }
    }

    fun byAlbumName(data: ArrayList<Artist>, albumName: String): Artist {
        data.forEach {
            val result = it.albums.filter { it.name == albumName }
            if (result.isNotEmpty()) {
                return it
            }
        }
        return Artist()
    }
}
