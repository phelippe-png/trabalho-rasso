package QuadradoSoma

import AreaCircunferencia.PI
import java.lang.Exception
import java.util.*

var scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    var primeiroNumero: Int
    var segundoNumero: Int
    var terceiroNumero: Int
    var resultado: Int
    var informouNumero = false

    do {
        try {
            println("Informe o primeiro número: ")
            primeiroNumero = readLine()?.toIntOrNull()!!

            println("Informe o segundo número: ")
            segundoNumero = readLine()?.toIntOrNull()!!

            println("Informe o terceiro número: ")
            terceiroNumero = readLine()?.toIntOrNull()!!

            resultado = primeiroNumero + segundoNumero + terceiroNumero
            resultado = Math.pow(resultado.toDouble(), 2.0).toInt()
            println("O quadrado da soma dos três números é: ${resultado}")

            informouNumero = true
        } catch (ex: Exception){
            println("Informe apenas números inteiros!")
            println("")
        }
    } while (!informouNumero)
}
