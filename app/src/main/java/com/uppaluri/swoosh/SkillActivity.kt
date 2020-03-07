package com.uppaluri.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)

        Toast.makeText(this,league,Toast.LENGTH_LONG).show()

    }
}
