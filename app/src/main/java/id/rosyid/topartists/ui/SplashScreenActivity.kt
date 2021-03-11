package id.rosyid.topartists.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import id.rosyid.topartists.R
import id.rosyid.topartists.ui.main.MainActivity
import id.rosyid.topartists.utils.EnableFullscreen

class SplashScreenActivity : AppCompatActivity() {
    private val timeout = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

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
