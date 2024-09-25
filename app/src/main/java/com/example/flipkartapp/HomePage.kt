package com.example.flipkartapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        var flipkartButton = findViewById<ImageButton>(R.id.flipkart)
        var groceryButton = findViewById<ImageButton>(R.id.grocery)
        var salesButton = findViewById<ImageButton>(R.id.sale)

        flipkartButton.setOnClickListener {
            var i = Intent(this, Flipkart::class.java)
            startActivity(i)
        }

        groceryButton.setOnClickListener {
            var i = Intent(this, Grocery::class.java)
            startActivity(i)
        }

        salesButton.setOnClickListener {
            var i = Intent(this, Sales::class.java)
            startActivity(i)
        }
    }
}