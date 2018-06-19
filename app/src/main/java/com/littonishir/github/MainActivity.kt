package com.littonishir.github

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.setOnClickListener {
            Settings.email = et1.text.toString()
            Settings.password = et2.text.toString()
        }
        textview2.setOnClickListener {
            var s = "${Settings.email},${Settings.password}"
//            Settings.email = et1.text.toString()
//            Settings.password = et2.text.toString()
            textview2.text = s

        }

    }

}

