package com.khinthirisoe.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)

        rollButton.setOnClickListener {
            resultText.text = rollDice().toString()
        }

    }

    private fun rollDice(): Int {
        return Random().nextInt(6) + 1
    }
}
