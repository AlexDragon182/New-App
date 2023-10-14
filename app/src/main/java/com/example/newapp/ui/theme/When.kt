package com.example.newapp.ui.theme

fun main (){
getMonth(14)
}
//usar when cuando halla mas de un elde en un if
fun getMonth(mes:Int):String{
    when (mes){
        1 -> println("enero")
        2 -> println("feb")
        3 -> println("mar")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12-> {println("diciembre")
        println("Feliz Navidad")
        }
        else -> println("Mes no Valido")
    }
}
fun getTrimester(mes:Int):String {
    when (mes) {
        1, 2, 3 -> println("PrimerTrimestre")
        4, 5, 6 -> println("SegundoTrimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Mes no Valido")
    }
}

fun getSemester (mes:Int):String{
   var result = when(mes){
        in 1..6 -> println("PrimerSemestre")
        in 7..12 -> println("PrimerSemestre")
        in 1..12 -> println(" Semestre no Valido")
       else -> "asda"
    }
    return result
}

fun result (value:Any){
    when(value){
        is Int -> value + value
        is String -> println("value")
        is Boolean -> if(value) print ("holis")
    }
}
