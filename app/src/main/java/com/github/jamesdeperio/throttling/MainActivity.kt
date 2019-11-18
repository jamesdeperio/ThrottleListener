package com.github.jamesdeperio.throttling

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.jamesdeperio.throttlelistener.setOnThrottleClickListener

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCounter = findViewById<TextView>(R.id.tv_counter)!!
        val btnClick = findViewById<Button>(R.id.btn_click)!!
        var counter = 0

        btnClick.setOnThrottleClickListener(delayInMillis = 2000) {
            counter++
            tvCounter.text = "Executed Clicked: $counter"
        }

        /* long method
        btnClick.setOnClickListener(object :OnThrottleClickListener(delayInMillis = 2000){
            override fun onThrottleClick(v: View) {
                counter++
                tvCounter.text = "Executed Clicked: $counter"
            }
        })
         */
    }
}
