package Controller

import Model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_swoosh_page3.*

class SwooshPage3 : BaseActivity() {
lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swoosh_page3)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }
    fun beginnerBtnClick(view: View){
        proSkillBtn.isChecked=false
        player.skill="Beginner"
    }
    fun proBtnClick(view: View){
        beginnerSkillBtn.isChecked=false
        player.skill="Pro"
    }
    fun finishSkillBtnClick(view: View){
        if (player.skill!=""){
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select skill level",Toast.LENGTH_SHORT).show()
        }

    }
}