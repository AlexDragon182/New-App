package com.example.newapp.ui.theme

fun main (){
    val readOnly:List<String> = listOf("Lunes","Martes", "Miercoles","Jueves","Viernes","Sabado" ,"Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes", "Miercoles","Jueves","Viernes","Sabado" ,"Domingo")
    println(weekDays)
    weekDays.add(3,"alex")

    if(weekDays.isEmpty()){

    }else{
        weekDays.forEach{ println(it) }
    }
    if(weekDays.isNotEmpty()){
        weekDays.forEach{ println(it) }
    }

    val example = readOnly.filter { it.contains("s") }
    readOnly.forEach{( println(it))}
}