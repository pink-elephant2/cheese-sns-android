package yamashita.kazumasa.cheesesns.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import yamashita.kazumasa.cheesesns.R

class SplashActivity : AppCompatActivity() {
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, DELAY_TIME)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }
    private val runnable = Runnable {
        val intent = HomeActivity.createIntent(this)
        startActivity(intent)
        finish()
    }

    companion object {
        private const val DELAY_TIME = 2000L
        fun createIntent(context: Context) =
            Intent(context, SplashActivity::class.java)
    }
}
