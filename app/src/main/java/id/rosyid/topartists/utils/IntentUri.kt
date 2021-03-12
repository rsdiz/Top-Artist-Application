package id.rosyid.topartists.utils

import android.content.Intent
import android.net.Uri

object IntentUri {
    fun open(uriString: String): Intent {
        return Intent(Intent.ACTION_VIEW, Uri.parse(uriString))
    }
}
