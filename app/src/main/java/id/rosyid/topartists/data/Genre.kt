package id.rosyid.topartists.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Genre(
    var name: String = ""
) : Parcelable
