package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {

    lateinit var button5 :Button
    lateinit var textView56 :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        button5 =findViewById(R.id.button5)
        textView56 =findViewById(R.id.textView56)

        button5.setOnClickListener(){
            val intent1=Intent(this,Login::class.java)
            startActivity(intent1)
        }
        textView56.setOnClickListener(){
            val intent1=Intent(this,Login::class.java)
            startActivity(intent1)
        }
    }
}