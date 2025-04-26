package com.cabello.franco.laboratoriocalificado01
import org.junit.Test
import org.junit.Assert.assertEquals

class Ejercicio01Kotlin {
    //Esta función encuentra el número mayor
    fun encontrarMayor(num1: Int, num2: Int, num3: Int): Int {
        return if (num1 >= num2 && num1 >= num3) {
            num1
        } else if (num2 >= num1 && num2 >= num3) {
            num2
        } else {
            num3
        }
    }
}
//Ejemplos
fun main() {
    val ejercicio = Ejercicio01Kotlin()

    println("Resultado 1: El mayor entre (5, 12, 3) es ${ejercicio.encontrarMayor(5, 12, 3)}")
    println("Resultado 2: El mayor entre (9, 4, 9) es ${ejercicio.encontrarMayor(9, 4, 9)}")
    println("Resultado 3: El mayor entre (7, 7, 5) es ${ejercicio.encontrarMayor(7, 7, 5)}")
    println("Resultado 4: El mayor entre (2, 10, 1) es ${ejercicio.encontrarMayor(2, 10, 1)}")
}