package yamashita.kazumasa.cheesesns.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import yamashita.kazumasa.cheesesns.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    companion object {
        fun createIntent(context: Context) =
            Intent(context, HomeActivity::class.java)
    }
}
