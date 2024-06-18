package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {

    lateinit var button4 :Button
    lateinit var textView8:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button4 =findViewById(R.id.button4)
        textView8=findViewById(R.id.textView8)

        button4.setOnClickListener(){
            val intent1 =Intent(this,Home::class.java)
            startActivity(intent1)
        }

        textView8.setOnClickListener(){
            val intent1 =Intent(this,Signup::class.java)
            startActivity(intent1)
        }
    }
}