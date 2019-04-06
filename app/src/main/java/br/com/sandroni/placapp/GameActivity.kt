package br.com.sandroni.placapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    var goalAway = 0
    var goalHome = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        tvHome.text = intent.getStringExtra("HOME")
        tvaway.text = intent.getStringExtra("AWAY")

        if(savedInstanceState != null){
            goalAway = savedInstanceState.getInt("goalAway")
            goalHome = savedInstanceState.getInt("goalHome")
        }

       tvGoalHome.text = goalHome.toString()
       tvGoalAway.text = goalAway.toString()

        btGoalHome.setOnClickListener{
            goalHome++
            tvGoalHome.text = goalHome.toString()
        }

        btGoalAway.setOnClickListener{
            goalAway++
            tvGoalAway.text = goalAway.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putInt("goalHome", goalHome)
        outState?.putInt("goalAway", goalAway)
    }
}
