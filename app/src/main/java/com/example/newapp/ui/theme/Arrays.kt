package com.example.newapp.ui.theme
// secuencias de datos
fun main () {
    //Intex 0 to 6 Size 7
 var weekdays = arrayOf ("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(weekdays.size)
    if(weekdays.size >+ 8){
        println(weekdays[7])
    }else{
        println("no hay valores en el array")
    }

    //bucles para array
    for( position in weekdays.indices){
        println("eh pasado por aqui $position" )
    }

    for((position,value )in weekdays.withIndex()){
        println("eh pasado por aqui $position veces en $value")
    }
    for( weekday in weekdays) println("nothing")
}