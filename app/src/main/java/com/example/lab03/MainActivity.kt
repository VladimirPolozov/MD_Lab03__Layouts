package com.example.lab03

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textToSave: EditText = findViewById(R.id.editTextField)
        val isConfirmedToSaveText: CheckBox = findViewById(R.id.isConfirmedToSaveText)
        val saveTextButton: Button = findViewById(R.id.saveTextButton)
        val savedText: TextView = findViewById(R.id.savedText)
        val savingProgress: ProgressBar = findViewById(R.id.savingProgressBar)

        saveTextButton.setOnClickListener {
            if (isConfirmedToSaveText.isChecked) {
                savedText.text = textToSave.text
                savingProgress.progress += 10
            }
        }
    }
}