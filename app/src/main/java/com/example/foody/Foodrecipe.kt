package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Foodrecipe : AppCompatActivity() {

    lateinit var imageView34: ImageView
    lateinit var imageView35: ImageView
    lateinit var button19:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodrecipe)

        imageView34=findViewById(R.id.imageView34)
        imageView35=findViewById(R.id.imageView35)
        button19=findViewById(R.id.button19)

        imageView34.setOnClickListener(){
            val intent1 = Intent(this,Profile::class.java)
            startActivity(intent1)
        }
        imageView35.setOnClickListener(){
            val intent1 = Intent(this,Home::class.java)
            startActivity(intent1)
        }

        button19.setOnClickListener(){
            val intent1 = Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }
    }
}