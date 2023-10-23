package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.newapp.firstapp.FirstAppActivity
import com.example.newapp.firstapp.ResultActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludo)
        btnSaludApp.setOnClickListener{ navigateToSaludApp()}

    }

    private fun navigateToSaludApp() {
        var intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}