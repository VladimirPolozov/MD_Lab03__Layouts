package com.example.lab03

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val firstItemOfFirstLayout: TextView = findViewById(R.id.firstItemOfFirstLayout)
        val secondItemOfFirstLayout: TextView = findViewById(R.id.secondItemOfFirstLayout)
        val thirdItemOfFirstLayout: TextView = findViewById(R.id.thirdItemOfFirstLayout)
        val firstItemOfSecondLayout: TextView = findViewById(R.id.firstItemOfSecondLayout)
        val secondItemOfSecondLayout: TextView = findViewById(R.id.secondItemOfSecondLayout)
        val thirdItemOfSecondLayout: TextView = findViewById(R.id.thirdItemOfSecondLayout)
        val firstItemOfThirdLayout: TextView = findViewById(R.id.firstItemOfThirdLayout)
        val secondItemOfThirdLayout: TextView = findViewById(R.id.secondItemOfThirdLayout)
        val thirdItemOfThirdLayout: TextView = findViewById(R.id.thirdItemOfThirdLayout)
        val rollButton: Button = findViewById(R.id.rollButton)
        var index = 0

        rollButton.setOnClickListener {
            if (firstItemOfFirstLayout.text != "") {
                ++index

                firstItemOfFirstLayout.text = ""
                firstItemOfSecondLayout.text = ""
                firstItemOfThirdLayout.text = ""

                secondItemOfFirstLayout.text = index.toString()
                secondItemOfSecondLayout.text = index.toString()
                secondItemOfThirdLayout.text = index.toString()
            } else if (secondItemOfFirstLayout.text != "") {
                ++index

                secondItemOfFirstLayout.text = ""
                secondItemOfSecondLayout.text = ""
                secondItemOfThirdLayout.text = ""

                thirdItemOfFirstLayout.text = index.toString()
                thirdItemOfSecondLayout.text = index.toString()
                thirdItemOfThirdLayout.text = index.toString()
            } else {
                ++index

                thirdItemOfFirstLayout.text = ""
                thirdItemOfSecondLayout.text = ""
                thirdItemOfThirdLayout.text = ""

                firstItemOfFirstLayout.text = index.toString()
                firstItemOfSecondLayout.text = index.toString()
                firstItemOfThirdLayout.text = index.toString()
            }
        }
    }
}