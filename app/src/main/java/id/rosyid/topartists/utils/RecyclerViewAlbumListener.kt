package id.rosyid.topartists.utils

import id.rosyid.topartists.data.Album

abstract class RecyclerViewAlbumListener : RecyclerViewListener() {
    abstract var selectedAlbum: Album
    abstract var artistName: String
}
