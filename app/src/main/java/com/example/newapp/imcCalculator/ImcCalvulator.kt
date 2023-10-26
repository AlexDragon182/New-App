package com.example.newapp.imcCalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.compose.ui.text.font.FontWeight
import androidx.core.content.ContextCompat
import com.example.newapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalvulator : AppCompatActivity() {
    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false
    private var currentWeight: Int = 40
    private var currentAge: Int = 40
    private var currentHeight: Int = 120

    private lateinit var viewMale:CardView
    private lateinit var viewFemale: CardView

    private lateinit var tvHeight : TextView
    private lateinit var rsHeight : RangeSlider

    private lateinit var btnSubstract : FloatingActionButton
    private lateinit var btnPlusWeight : FloatingActionButton
    private lateinit var tvWeight: TextView

    private lateinit var btnSubstractAge : FloatingActionButton
    private lateinit var btnPlusAge : FloatingActionButton
    private lateinit var tvAge: TextView

    private lateinit var btncalculate : Button

    companion object {
        const val  IMCKEY = "IMC_RESULT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calvulator)
        initComponents()
        initListeners()
        initUI()
    }




    private fun initComponents(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnPlusWeight = findViewById(R.id.btnadd)
        btnSubstract = findViewById(R.id.btnsubstract)
        tvWeight = findViewById(R.id.tvWeight)
        btnPlusAge = findViewById(R.id.btnAddAge)
        btnSubstractAge = findViewById(R.id.btnSubstractAge)
        tvAge = findViewById(R.id.tvAge)
        btncalculate = findViewById(R.id.btncalculate)

    }
    private fun initListeners() {
    viewMale.setOnClickListener{
        changeGender()
        setGenderColor()
    }
    viewFemale.setOnClickListener{
        changeGender()
        setGenderColor()
    }
        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"
        }

        btnPlusWeight.setOnClickListener{
            currentWeight +=1
            setWeight()
        }
        btnSubstract.setOnClickListener{
            currentWeight -= 1
            setWeight()

        }
        btnPlusAge.setOnClickListener{
            currentAge +=1
            setAge()
        }
        btnSubstractAge.setOnClickListener{
            currentAge -= 1
            setAge()

        }
        btncalculate.setOnClickListener{
            val result = calculatingIMC()
            navigateToResult(result)
        }
    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this, ResultIMC::class.java)
        intent.putExtra(IMCKEY,result)
        startActivity(intent)
    }

    private fun calculatingIMC() :Double{
        val df = DecimalFormat("#.##")
        val imc = currentWeight/(currentHeight.toDouble()/100 * currentHeight.toDouble()/100)
        var  result = df.format(imc).toDouble()
        return result

    }

    private fun setWeight(){
        tvWeight.text = currentWeight.toString()
    }

    private fun setAge(){
        tvAge.text = currentAge.toString()
    }

    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }
    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor (isSelectedComponent:Boolean):Int{
        val colorReference = if (isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }
        return ContextCompat.getColor(this,colorReference)
    }
    private fun initUI() {
        setGenderColor()
        setWeight()
        setAge()
    }



}