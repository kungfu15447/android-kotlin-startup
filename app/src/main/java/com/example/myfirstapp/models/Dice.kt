package com.example.myfirstapp.models

class Dice(private val sides: Int) {
    fun roll(): Int {
        val diceRange = 1..sides
        return diceRange.random()
    }
}