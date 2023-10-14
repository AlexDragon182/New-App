package com.example.newapp.ui.theme

// kotlin tiene seguridad contra los nulos
//? checa para valores nulos
fun main (){
    var name:String? = "kiubole"
     println(name?.get(3)) ?: "es nulo carnalito"
}