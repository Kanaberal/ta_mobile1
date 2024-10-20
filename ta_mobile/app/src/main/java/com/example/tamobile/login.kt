package com.example.tamobile

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val backBtn = findViewById<ImageButton>(R.id.backbutton)
        val loginBtn = findViewById<ImageButton>(R.id.loginbtn)
        val inputNama = findViewById<EditText>(R.id.inputnama)
        val inputPassword = findViewById<EditText>(R.id.inputpw)


        backBtn.setOnClickListener {
            val intent = Intent(this, halaman_awal::class.java)
            startActivity(intent)
            finish()
        }


        loginBtn.setOnClickListener {
            val username = inputNama.text.toString()
            val password = inputPassword.text.toString()


            if (username == "admin" && password == "admin") {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                
                Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}