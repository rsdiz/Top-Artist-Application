package id.rosyid.topartists.ui.main.artists

import id.rosyid.topartists.data.Artist

class SortArtistsByMonthlyListener {
    companion object {
        fun asc(data: ArrayList<Artist>): List<Artist> {
            return data.sortedBy { it.monthlyListener }
        }

        fun desc(data: ArrayList<Artist>): List<Artist> {
            return data.sortedByDescending { it.monthlyListener }
        }
    }
}
