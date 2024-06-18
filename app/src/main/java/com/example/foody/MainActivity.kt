package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button1 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 =findViewById(R.id.button1)

        button1.setOnClickListener(){
            val intent1 =Intent(this,Onboard::class.java)
            startActivity(intent1)
        }
    }
}