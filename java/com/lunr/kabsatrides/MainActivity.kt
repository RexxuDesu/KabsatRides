package com.lunr.kabsatrides

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "You are testing KabsatRides", Toast.LENGTH_LONG).show()

        val btnClickMe = findViewById<Button>(R.id.button001)
        btnClickMe.setOnClickListener {
            setContentView(R.layout.activity_lobby)
        }

    }
}
