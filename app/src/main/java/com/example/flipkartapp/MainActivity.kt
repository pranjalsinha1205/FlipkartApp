package com.example.flipkartapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)
        var login = findViewById<ImageButton>(R.id.login)
        var loginText = findViewById<TextView>(R.id.loginText)

        fun toNextPage(){
            Toast.makeText(this, "Welcome to flipkart, " + username.text.toString() + "!", Toast.LENGTH_LONG).show()
            var i = Intent(this, HomePage::class.java)
            startActivity(i)
        }

        login.setOnClickListener {
            toNextPage()
        }

        loginText.setOnClickListener{
            toNextPage()
        }
    }
}