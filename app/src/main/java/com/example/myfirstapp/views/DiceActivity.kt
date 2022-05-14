package com.example.myfirstapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myfirstapp.R
import com.example.myfirstapp.models.Dice

class DiceActivity : AppCompatActivity() {
    private lateinit var dice: Dice
    private lateinit var rollButton: Button
    private lateinit var rolledNumberTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        rollButton = findViewById(R.id.rollButton)
        rolledNumberTextView = findViewById(R.id.rolledNumberTextView)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val rolledNumber = dice.roll()
        rolledNumberTextView.text = "$rolledNumber"
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show()
    }
}