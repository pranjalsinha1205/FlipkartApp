package com.example.flipkartapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        var flipkart = findViewById<ImageButton>(R.id.flipkart)
        var grocery = findViewById<ImageButton>(R.id.grocery)
        var sale = findViewById<ImageButton>(R.id.sale)

        flipkart.setOnClickListener {
            var i = Intent(this, flipkart::class.java)
            startActivity(i)
        }

        grocery.setOnClickListener {
            var i = Intent(this, grocery::class.java)
            startActivity(i)
        }

        sale.setOnClickListener {
            var i = Intent(this, sales::class.java)
            startActivity(i)
        }
    }
}