package com.example.calapptask

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var digitOnScreen = StringBuilder(12)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        numericalButtons()
    }
    private fun appendToDigitOnScreen(digit: String) {
        digitOnScreen.append(digit)
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = digitOnScreen.toString()
    }
    private fun numericalButtons() {
        val oneBtn: Button = findViewById(R.id.one)
        val twoBtn: Button = findViewById(R.id.two)
        val threeBtn: Button = findViewById(R.id.three)
        val fourBtn: Button = findViewById(R.id.four)
        val fiveBtn: Button = findViewById(R.id.five)
        val sixBtn: Button = findViewById(R.id.six)
        val sevenBtn: Button = findViewById(R.id.seven)
        val eightBtn: Button = findViewById(R.id.eight)
        val nineBtn: Button = findViewById(R.id.nine)
        val zeroBtn: Button = findViewById(R.id.zero)
        val dotBtn: Button = findViewById(R.id.coma)

        oneBtn.setOnClickListener { appendToDigitOnScreen("1") }
        twoBtn.setOnClickListener { appendToDigitOnScreen("2") }
        threeBtn.setOnClickListener { appendToDigitOnScreen("3") }
        fourBtn.setOnClickListener { appendToDigitOnScreen("4") }
        fiveBtn.setOnClickListener { appendToDigitOnScreen("5") }
        sixBtn.setOnClickListener { appendToDigitOnScreen("6") }
        sevenBtn.setOnClickListener { appendToDigitOnScreen("7") }
        eightBtn.setOnClickListener { appendToDigitOnScreen("8") }
        nineBtn.setOnClickListener { appendToDigitOnScreen("9") }
        zeroBtn.setOnClickListener { appendToDigitOnScreen("0") }
        dotBtn.setOnClickListener { appendToDigitOnScreen(".") }
    }
}