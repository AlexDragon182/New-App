package com.example.newapp.ui.theme

fun main (){

}
// == compara
//! lo contrario
// & ans
//
fun ifMultipleOr(){
    var mascota = "dog"
    var feli = true
    if(mascota == "dog" || (mascota == "gato"&& feli)){
        println("tas bien")
    }
}
fun ifMultiple(){
    var edad =18
    var permisoParental = false
    var Feliz =  true

    if(edad >= 18 && permisoParental && Feliz ){
        println("puede beber")
    }else{
        println("se toma un jugo")
    }
}
fun ifInt(){
    var edad = 29
    if( edad >= 18) {
        println("puede beber")
    }else{
        println("tomate un jugo")
    }
}
fun ifBoolean (){
    var soyFeliz:Boolean = true

    if(!soyFeliz){
        println(" ando Sad ")
    }
}
fun ifAnidado(){
    val animal = "dog"
    if (animal == "dog") {
        println("es un perro")
    }else     if (animal == "cat") {
        println("es un gato")
    }else     if (animal == "bird") {
        println("es un perro")
    }
}
fun ifBasic () {
    val name = "Alex"
    if (name == "alex") {
        println("la Variable name es Alex")
    }else{
        println("Este no es alex")
    }


}