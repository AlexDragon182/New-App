package com.example.newapp.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatEditText
import com.example.newapp.R
//clase es un contenedor de funciones
class FirstAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Al arrancar la pantalla
        val btnStart = findViewById<Button>(R.id.start)
        var etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener{
            val name = etName.text.toString()
            Log.i("Alex", "Boton Pulsado $name")
            var intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("EXTRA_NAME",name)
            startActivity(intent)
        }
    }
}