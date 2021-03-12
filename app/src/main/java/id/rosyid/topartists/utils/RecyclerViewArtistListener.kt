package id.rosyid.topartists.utils

import id.rosyid.topartists.data.Artist

abstract class RecyclerViewArtistListener : RecyclerViewListener() {
    abstract var selectedArtist: Artist
}
