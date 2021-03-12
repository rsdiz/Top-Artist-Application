package id.rosyid.topartists.ui.main.artists

class FormatNumberListener {
    companion object {
        fun format(number: Long): String {
            return String.format("%,d", number)
        }
    }
}
