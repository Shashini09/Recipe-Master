package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Onboard : AppCompatActivity() {

    lateinit var button2 :Button
    lateinit var button3 :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        button2 =findViewById(R.id.button2)
        button3 =findViewById(R.id.button3)

        button2.setOnClickListener(){
            val intent1=Intent(this,Signup::class.java)
            startActivity(intent1)
        }
        button3.setOnClickListener(){
            val intent1=Intent(this,Login::class.java)
            startActivity(intent1)
        }
    }
}