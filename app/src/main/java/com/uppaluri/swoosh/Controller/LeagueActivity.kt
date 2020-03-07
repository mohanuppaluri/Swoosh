package com.uppaluri.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.uppaluri.swoosh.Model.Player
import com.uppaluri.swoosh.R
import com.uppaluri.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {

        if(player.league!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please select a League",Toast.LENGTH_SHORT).show()
        }

    }


    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"
    }


    fun onWomensClicked(view: View) {

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"

    }


    fun onCoEdClicked(view: View) {

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "coed"


    }
}
