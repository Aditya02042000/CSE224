package com.example.cse224

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn1)
        btn.setOnClickListener {
            Toast.makeText(this,"Hostel Booked",Toast.LENGTH_SHORT).show()
            recreate()
        }
    }
}