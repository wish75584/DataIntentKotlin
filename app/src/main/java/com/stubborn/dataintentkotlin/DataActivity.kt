package com.stubborn.dataintentkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val d_name = findViewById<TextView>(R.id.d_name)
        val d_pass = findViewById<TextView>(R.id.d_pass)

        val intent = intent
        val D_NAME: String = intent.getStringExtra("U_NAME")
        val D_PASS: String = intent.getStringExtra("U_PASS")

        d_name.setText(D_NAME)
        d_pass.setText(D_PASS)

    }
}
