package com.example.myfirstapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myfirstapp.R
import com.example.myfirstapp.models.Dice

class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val rolledNumberTextView = findViewById<TextView>(R.id.rolledNumberTextView)
        val dice = Dice(6)

        rollButton.setOnClickListener {
            val rolledNumber = dice.roll()
            rolledNumberTextView.text = "$rolledNumber"
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}