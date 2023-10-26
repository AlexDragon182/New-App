package com.example.newapp.imcCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.newapp.R
import com.example.newapp.imcCalculator.ImcCalvulator.Companion.IMCKEY

class ResultIMC : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var  tvIMC : TextView
    private lateinit var  tvMessage:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val result = intent.extras?.getDouble(IMCKEY)?:-1.0
        iniComponents()
        initUI(result)

    }

    private fun initUI(result: Double) {
        when (result){
            in 0.00..18.50->{
                tvIMC
                tvResult
                tvMessage
            }
            in 18.51..24.99->{
                tvIMC
                tvResult
                tvMessage
            }
            in 24.99..29.99->{
                tvIMC
                tvResult
                tvMessage
            }
            in 30.00..99.99->{
                tvIMC
                tvResult
                tvMessage
            }else - >{
            tvIMC
            tvResult
            tvMessage
            }
        }


    }

    private fun iniComponents() {
    tvIMC = findViewById(R.id.tvIMC)
    tvResult = findViewById(R.id.tvResult)
    tvMessage = findViewById(R.id.tvMessage)
    }
}