package yamashita.kazumasa.cheesesns.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import yamashita.kazumasa.cheesesns.R


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(yamashita.kazumasa.cheesesns.R.layout.activity_home)
        val toolbar = findViewById<View>(R.id.tool_bar) as Toolbar
        setSupportActionBar(toolbar)

        // TODO API Serviceインスタンス化
    }

    override fun onResume() {
        super.onResume()
        // TODO API 通信

        // TODO レイアウト反映
        initView()
    }

    private fun initView() {

    }

    companion object {
        fun createIntent(context: Context) =
            Intent(context, HomeActivity::class.java)
    }
}
