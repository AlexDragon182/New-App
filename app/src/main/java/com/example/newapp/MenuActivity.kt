package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.newapp.firstapp.FirstAppActivity
import com.example.newapp.firstapp.ResultActivity
import com.example.newapp.imcCalculator.ImcCalvulator

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludo)
        btnSaludApp.setOnClickListener{ navigateToSaludApp()}

        var btnIMC = findViewById<Button>(R.id.btnIMC)
        btnIMC.setOnClickListener{ navigateToImcCalculator()}

    }

    private fun navigateToSaludApp() {
        var intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcCalculator() {
        var intent = Intent(this, ImcCalvulator::class.java)
        startActivity(intent)
    }
}