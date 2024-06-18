package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Profile : AppCompatActivity() {

    lateinit var imageView37: ImageView
    lateinit var imageView38: ImageView
    lateinit var button20 :Button
    lateinit var button21:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        imageView37=findViewById(R.id.imageView37)
        imageView38=findViewById(R.id.imageView38)
        button20=findViewById(R.id.button20)
        button21=findViewById(R.id.button21)

        imageView37.setOnClickListener(){
            val intent1 = Intent(this,Home::class.java)
            startActivity(intent1)
        }
        imageView38.setOnClickListener(){
            val intent1 = Intent(this,Profile::class.java)
            startActivity(intent1)
        }

        button20.setOnClickListener(){
            val intent1 = Intent(this,Login::class.java)
            startActivity(intent1)
        }
        button21.setOnClickListener(){
            val intent1 = Intent(this,Profile::class.java)
            startActivity(intent1)
        }
    }
}