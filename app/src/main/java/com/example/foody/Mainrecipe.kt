package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Mainrecipe : AppCompatActivity() {

    lateinit var imageView23: ImageView
    lateinit var button18:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainrecipe)

        imageView23=findViewById(R.id.imageView23)
        button18=findViewById(R.id.button18)

        imageView23.setOnClickListener(){
            val intent1=Intent(this,Recipes::class.java)
            startActivity(intent1)
        }

        button18.setOnClickListener(){
            val intent1=Intent(this,Foodrecipe::class.java)
            startActivity(intent1)
        }
    }
}