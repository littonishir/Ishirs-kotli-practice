package com.littonishir.github

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val value = Games("", "2")
        val textView = TextView(this)
        textView.setOnClickListener {object : View.OnClickListener {
                override fun onClick(view: View?) {
                    textView.text = "hi"
                }
            }
        }

        operator fun String.times(time: Int): String {
            val stringBuilder = StringBuilder()
            for (i in 0 until time) {
                stringBuilder.append(this + "\n")
            }
            return stringBuilder.toString()
        }


    }

}

