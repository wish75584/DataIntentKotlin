package com.stubborn.dataintentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.name)
        val pass = findViewById<EditText>(R.id.pass)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener{

            val NAME:String  = name.text.toString()
            val PASS:String = pass.text.toString()

            val intent = Intent(this,DataActivity::class.java)
                    intent.putExtra("U_NAME",NAME)
                    intent.putExtra("U_PASS",PASS)
                startActivity(intent)

        }


    }
}
