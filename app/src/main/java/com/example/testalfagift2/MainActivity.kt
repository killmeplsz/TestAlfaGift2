package com.example.testalfagift2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameInput = findViewById<EditText>(R.id.editTextUsername)
        val passwordInput = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            // Show the loading screen
            progressBar.visibility = android.view.View.VISIBLE

            // Simulate authentication process (for demo)
            android.os.Handler().postDelayed({
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(this, "Username and password cannot be empty", Toast.LENGTH_SHORT).show()
                } else if (username == "alfagift-admin" && password == "asdf") {
                    startActivity(Intent(this, StudentListActivity::class.java))
                } else {
                    Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
                }

                // Hide the loading screen
                progressBar.visibility = android.view.View.GONE
            }, 2000) // Simulating a delay of 2 seconds for the login process
        }
    }
}
