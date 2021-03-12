package id.rosyid.topartists.ui

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import id.rosyid.topartists.R
import id.rosyid.topartists.ui.main.MainActivity
import id.rosyid.topartists.utils.Const
import id.rosyid.topartists.utils.EnableFullscreen
import id.rosyid.topartists.utils.PreferenceHelper
import id.rosyid.topartists.utils.PreferenceHelper.set

class SplashScreenActivity : AppCompatActivity() {
    private val timeout = 3000L
    private lateinit var mPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        mPreferences = PreferenceHelper.customPrefs(this, Const.FAVORITE)
        mPreferences[Const.IS_FIRST_TIME] = !mPreferences.contains(Const.IS_FIRST_TIME)

        val intentTarget = Intent(this, MainActivity::class.java)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(intentTarget)
                finish()
            },
            timeout
        )
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) EnableFullscreen.apply(window)
    }
}
