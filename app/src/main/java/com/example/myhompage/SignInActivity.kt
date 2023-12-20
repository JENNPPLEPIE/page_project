package com.example.myhompage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val et_id = findViewById<EditText>(R.id.et_id)
        val et_password = findViewById<EditText>(R.id.et_password)


        val btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)






        }



        val btn_signup = findViewById<Button>(R.id.btn_signup)
        btn_signup.setOnClickListener {

            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)


        }
    }
}