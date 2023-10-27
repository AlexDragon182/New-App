package com.example.newapp.imcCalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.newapp.R
import com.example.newapp.imcCalculator.ImcCalvulator.Companion.IMCKEY

class ResultIMC : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var  tvIMC : TextView
    private lateinit var  tvMessage:TextView
    private lateinit var  btnRecalculate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val result = intent.extras?.getDouble(IMCKEY)?:-1.0
        iniComponents()
        initUI(result)
        initListeners()

    }
    private fun navigateToCalculator() {
        val intent = Intent(this, ImcCalvulator::class.java)
        startActivity(intent)
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener{
            navigateToCalculator()
        }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when (result) {
            in 0.00..18.50 -> {
                tvResult.text = getString(R.string.title_peso_pluma)
                tvMessage.text = getString(R.string.title_peso_pluima_description)
            }

            in 18.51..24.99 -> {
                tvResult.text = getString(R.string.title_peso_mosca)
                tvMessage.text = getString(R.string.title_peso_mosca_description)
            }

            in 24.99..29.99 -> {
                tvResult.text = getString(R.string.title_peso_porky)
                tvMessage.text = getString(R.string.title_peso_porky_description)
            }

            in 30.00..99.99 -> {
                tvResult.text = getString(R.string.title_peso_galactus)
                tvMessage.text = getString(R.string.title_peso_porky_galactus)
            }

            else -> {
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvMessage.text = getString(R.string.error)
            }
        }


    }

    private fun iniComponents() {
    tvIMC = findViewById(R.id.tvIMC)
    tvResult = findViewById(R.id.tvResult)
    tvMessage = findViewById(R.id.tvMessage)
        btnRecalculate = findViewById(R.id.btnrecalculate)
    }
}