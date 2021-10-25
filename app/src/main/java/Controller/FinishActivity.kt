package Controller

import Model.Player
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*


class FinishActivity : BaseActivity(){
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
        searchLeagueTxt.text("Looking for ${player.league} ${player.skill} league near you ...")
        println(player.skill)
        println(player.league)

    }

}


private fun TextView.text(s: String) {

}


