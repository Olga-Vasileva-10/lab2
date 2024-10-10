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
        lastTermTextView = findViewById(R.id.textView7)
        iterationsTextView = findViewById(R.id.textView8)

        button.setOnClickListener {
            val n = editText.text.toString().toIntOrNull()


        }
    }
}


