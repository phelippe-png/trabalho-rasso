package SomaDosQuadrados

fun main() {
    println("Digite o primeiro valor:")
    val valor1 = readLine()!!.toInt()
    println("Digite o segundo valor:")
    val valor2 = readLine()!!.toInt()
    println("Digite o terceiro valor:")
    val valor3 = readLine()!!.toInt()

    val resultado = valor1 * valor1 + valor2 * valor2 + valor3 * valor3

    println("A soma dos quadrados dos valores lidos é : ${resultado}")
}