package com.example.flipkartapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Grocery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grocery)

        var logo = findViewById<ImageButton>(R.id.logo)
        logo.setOnClickListener {
            var i = Intent(this, HomePage::class.java)
            startActivity(i)
        }

        var food_grains = findViewById<ImageButton>(R.id.food_grains)
        food_grains.setOnClickListener{
            var i = Intent(this, food_grains::class.java)
            startActivity(i)
        }

        var veggies = findViewById<ImageButton>(R.id.veggies)
        veggies.setOnClickListener {
            var i = Intent(this, veggies::class.java)
            startActivity(i)
        }

        var processed_foods = findViewById<ImageButton>(R.id.processed_foods)
        processed_foods.setOnClickListener {
            var i = Intent(this, processed_foods::class.java)
            startActivity(i)
        }

        fun doPayment(){
            var i = Intent(this, Payment::class.java)
            startActivity(i)
        }

        var payment = findViewById<ImageButton>(R.id.buy)
        payment.setOnClickListener {
            doPayment()
        }

        var paymentText = findViewById<TextView>(R.id.buyText)
        paymentText.setOnClickListener {
            doPayment()
        }

    }
}