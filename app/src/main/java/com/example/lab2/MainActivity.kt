package com.example.lab2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var sumTextView: TextView
    private lateinit var lastTermTextView: TextView
    private lateinit var iterationsTextView: TextView
    private lateinit var fiveTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editText = findViewById(R.id.editTextText2)
        button = findViewById(R.id.button2)
        sumTextView = findViewById(R.id.textView6)
        fiveTextView = findViewById(R.id.textView5)

        button.setOnClickListener {
            val n = editText.text.toString().toIntOrNull()
            if (n != null && n > 0) {
                val (sum) = calculateSum(n)
                sumTextView.text = "Сумма: $sum"
            } else {
                sumTextView.text = "Введите корректное значение n > 0"
            }
        }
    }
    private fun calculateSum(n: Int): Pair<Double, Int> {
        var sum = 0.0
        var iterations = 0

        for (i in 1..n) {
            sum += 1.0 / factorial(i)
        }

        return Pair(sum, iterations)
    }

    private fun factorial(n: Int): Double {
        return if (n == 0) 1.0 else n * factorial(n - 1)
    }
}


