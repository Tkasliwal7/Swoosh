package Controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, SwooshPage2::class.java)
            startActivity(leagueIntent)
        }
    }
}