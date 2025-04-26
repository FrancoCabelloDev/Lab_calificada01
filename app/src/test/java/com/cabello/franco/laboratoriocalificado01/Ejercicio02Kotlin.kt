package com.cabello.franco.laboratoriocalificado01

//Función que verifica si una palabra es un palíndromo(true,false)
class Ejercicio02Kotlin {

    fun esPalindromo(palabra: String): Boolean {
        // Eliminamos espacios y convertimos todo a minúsculas
        val limpia = palabra.replace("\\s".toRegex(), "").lowercase()
        // Comparamos la palabra limpia con su reverso
        return limpia == limpia.reversed()
    }
}
//Probamos con las siguentes palabras
fun main() {
    val ejercicio = Ejercicio02Kotlin()

    println("'Racecar' es palindromo?: ${ejercicio.esPalindromo("Racecar")}")
    println("'Anita lava la tina' es palindromo?: ${ejercicio.esPalindromo("Anita lava la tina")}")
    println("'Kotlin' es palindromo?: ${ejercicio.esPalindromo("Kotlin")}")
    println("'Android' es palindromo?: ${ejercicio.esPalindromo("Android")}")
}