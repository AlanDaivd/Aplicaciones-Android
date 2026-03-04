package com.example.repromusic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val aceptarButton : Button = findViewById<Button>(R.id.enter)
        aceptarButton.setOnClickListener {
            doLogIn()
        }

    }

    fun doLogIn() {
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        if (username.getText().isNotEmpty() && password.getText().isNotEmpty()) {
            if (username.getText().toString() == "admin" &&
                password.getText().toString() == "123") {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                Toast.makeText(this, "Usuario incorrecto",
                    Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Ingresa un usuario y contraseña", Toast.LENGTH_SHORT).show()
        }
    }
}