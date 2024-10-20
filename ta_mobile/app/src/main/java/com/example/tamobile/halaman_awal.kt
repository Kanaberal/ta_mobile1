package com.example.tamobile


import android.os.Bundle

import android.content.Intent

import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class halaman_awal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_awal)


        val backBtn = findViewById<ImageButton>(R.id.nextbtn)
        backBtn.setOnClickListener {

            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
    }
}