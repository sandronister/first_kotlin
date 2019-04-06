package br.com.sandroni.placapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.sandroni.placapp.extensions.value
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btStart.setOnClickListener{
            val nextSreenIntent = Intent(this,GameActivity::class.java)

            nextSreenIntent.putExtra("HOME",inputHome.value())
            nextSreenIntent.putExtra("AWAY", inputAway.value())

            startActivity(nextSreenIntent)
        }
    }
}
