package com.example.myhompage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn_login = findViewById<Button>(R.id.btn_close)
        btn_login.setOnClickListener {
            finish()
        }




    }
}