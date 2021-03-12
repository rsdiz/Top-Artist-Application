package id.rosyid.topartists.utils

import android.content.SharedPreferences
import android.widget.ToggleButton
import id.rosyid.topartists.R
import id.rosyid.topartists.utils.PreferenceHelper.get
import id.rosyid.topartists.utils.PreferenceHelper.set

object InitFavoriteToggle {
    fun set(
        mPreference: SharedPreferences,
        toggleButton: ToggleButton,
        name: String
    ) {
        if (mPreference[name]) toggleButton.setBackgroundResource(R.drawable.ic_baseline_favorite_32)
        else toggleButton.setBackgroundResource(R.drawable.ic_baseline_favorite_border_32)

        toggleButton.isChecked = mPreference[name]

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            mPreference[name] = isChecked
            if (isChecked) {
                buttonView.setBackgroundResource(R.drawable.ic_baseline_favorite_32)
            } else {
                buttonView.setBackgroundResource(R.drawable.ic_baseline_favorite_border_32)
            }
        }
    }
}
