package com.example.amphibians

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t=findViewById<TextView>(R.id.t1)
        t.setOnClickListener{
            val intent= Intent(this,Great::class.java)
            startActivity(intent)
        }
    }
}