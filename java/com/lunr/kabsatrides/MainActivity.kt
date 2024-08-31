package com.lunr.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.button001)
        btnClickMe.setOnClickListener {
            btnClickMe.text = "Placeholder"
        }
    }

}
