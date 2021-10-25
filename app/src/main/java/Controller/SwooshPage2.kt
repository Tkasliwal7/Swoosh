package Controller

import Model.Player
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_swoosh_page2.*

class SwooshPage2 : BaseActivity() {
    var player = Player("","")
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swoosh_page2)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        if (savedInstanceState != null){
            player= savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun mensLeagueClicked(view:View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        player.league="Mens"

    }
    fun womensLeagueClicked(view:View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        player.league="Womens"

    }
    fun coedLeagueClicked(view:View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        player.league="Co-Ed"
    }
    fun leagueNextClicked(view:View){
        if (player.league!=""){
            val page3 = Intent(this , SwooshPage3::class.java)
            page3.putExtra(EXTRA_PLAYER,player)
            startActivity(page3)

        }else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }

    }
}

