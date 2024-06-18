package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {

    lateinit var button7 : Button
    lateinit var button6 : Button
    lateinit var button11: Button
    lateinit var button12: Button
    lateinit var button13:Button
    lateinit var imageView9: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        button7 =findViewById(R.id.button7)
        button6 =findViewById(R.id.button6)
        button11=findViewById(R.id.button11)
        button12=findViewById(R.id.button12)
        button13=findViewById(R.id.button13)
        imageView9=findViewById(R.id.imageView9)

        button7.setOnClickListener(){
            val intent1 =Intent(this,Recipes::class.java)
            startActivity(intent1)
        }

        button6.setOnClickListener(){
            val intent1 =Intent(this,Recipes::class.java)
            startActivity(intent1)
        }

        button11.setOnClickListener(){
            val intent1 =Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }

        button12.setOnClickListener(){
            val intent1 =Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }
        button13.setOnClickListener(){
            val intent1 =Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }

        imageView9.setOnClickListener(){
            val intent1 =Intent(this,Profile::class.java)
            startActivity(intent1)
        }
    }
}