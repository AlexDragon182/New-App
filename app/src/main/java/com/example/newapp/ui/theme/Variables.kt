package com.example.newapp.ui.theme



class Variables {
    fun  main () {
        println("holiwis")
        variablesNumericas()
        myName()
        showMyAge(29)
        add( 2,4)
        val myRes = res(10,5)
        println(myRes)


        // una funcion es un contenedor de operaciones

    }
    fun variablesNumericas (){
        //Variables
        //No puede haber 2 variables iguales
        //los valores no pueden ser reasignados
        //las variables si
        // la programacion es secuencial
        //al sacar la variable de una funcion el alcance de una variable se reduce a esa funcion.
        /**
         *
         */
        val name = "Alex" // almacena texto
        val age: Int = 30  //Integer entero -2,147,483,647 a 2,147,483,647
        val age2: Int = 29  //Integer entero -2,147,483,647 a 2,147,483,647
        var matricula : Long  = 30  // Usa mas memoria que un INT -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
        val calificacion : Float = 30.3f // soporta hasta 6 decimales
        val puntosExtra : Double = 12312.2342342 // el doble de decimales , gasta mas espacio de memoria 12 o 14

        //Alfanumericas

        val charExample1 : Char = 'a' // soporta lo que sea mientras sea 1 caracter
        val charExample2 : Char = '2' // soporta lo que sea mientras sea 1 caracter
        val charExample3 : Char = '@' // soporta lo que sea mientras sea 1 caracter

        //hay que tener cuidado con el tipo de variable que trabaja un string
        val stringExample1 : String = "HOLIWIS " // Aqui cabe lo que quieras
        val stringExample2 : String = "2 " // Aqui cabe lo que quieras

        val booleanExample1 : Boolean = true // puede ser true o false
        val booleanExample2 : Boolean = false // puede ser true o false

        println(booleanExample1)

        //Funciones Aritmeticas

        println("Sumar :")
        println(age + age2)
        println("Restar :")
        println(age - age2)
        println("Multiplicar :")
        println(age * age2)
        println("Division :")
        println(age / age2)
        println("Modulo :")
        println(age % age2)

        //puedes dumer longs , floats y Ints y Doubles pero te lo va a cambiar de un tipo a otro
        var exampleSum : Int = age + calificacion.toInt();

        print(stringExample1 + stringExample2)
    }

    fun myName (){
        println("Alex")

    }

    fun showMyAge(currentAge:Int){
        println("Tengo $currentAge Anos")
    }

    fun add (N1:Int , N2:Int){
        println("Sum : $N1 + $N2]")
    }
    fun res (N1:Int , N2:Int):Int{
        println("Sum : $N1 - $N2]")
        return N1 - N2
    }
}