package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloButton)
        val imageView = findViewById<ImageView>(R.id.dogImageView)
        val textView = findViewById<TextView>(R.id.introTextView)

        button.setOnClickListener{
            Toast.makeText(this, "Hi!" , Toast.LENGTH_SHORT).show()
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.dogsayinghi))
            textView.setVisibility(View.VISIBLE)
        }
    }
}