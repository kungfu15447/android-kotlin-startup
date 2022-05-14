package com.example.myfirstapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.R

class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
    }

    fun rollDice() {
        val diceRange = 1..6
        val randomNumber = diceRange.random()
        println("Random number: ${randomNumber}")
    }
}