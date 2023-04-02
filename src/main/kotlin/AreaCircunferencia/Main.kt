package AreaCircunferencia

import java.lang.Exception

const val PI = 3.14159265

fun main(args: Array<String>) {
    var R: Double = 0.0
    var A: Double = 0.0
    var informouNumero = false

    do {
        try {
            println("Informe o valor para ao raio: ")
            R = readLine()?.toDoubleOrNull()!!
            informouNumero = true
        } catch (ex: Exception){
            println("Informe algum número!")
            println("")
        }
    } while (!informouNumero)

    A = PI * (Math.pow(R, 2.0))
    print("O cálculo da área é: ${A}")
}
