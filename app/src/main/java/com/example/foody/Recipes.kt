package com.example.foody

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Recipes : AppCompatActivity() {

    lateinit var imageView14: ImageView
    lateinit var imageView13: ImageView
    lateinit var imageView16: ImageView
    lateinit var button14:Button
    lateinit var button15 :Button
    lateinit var button16:Button
    lateinit var button17:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)

        imageView14=findViewById(R.id.imageView14)
        imageView13=findViewById(R.id.imageView13)
        imageView16=findViewById(R.id.imageView16)
        button14 =findViewById(R.id.button14)
        button15 =findViewById(R.id.button15)
        button16 =findViewById(R.id.button16)
        button17 =findViewById(R.id.button17)

        imageView14.setOnClickListener(){
            val intent1 =Intent(this,Home::class.java)
            startActivity(intent1)
        }

        imageView13.setOnClickListener(){
            val intent1 =Intent(this,Home::class.java)
            startActivity(intent1)
        }

        imageView16.setOnClickListener(){
            val intent1 =Intent(this,Profile::class.java)
            startActivity(intent1)
        }

        button14.setOnClickListener(){
            val intent1 =Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }
        button15.setOnClickListener(){
            val intent1 =Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }
        button16.setOnClickListener(){
            val intent1 =Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }
        button17.setOnClickListener(){
            val intent1 =Intent(this,Mainrecipe::class.java)
            startActivity(intent1)
        }
    }
}