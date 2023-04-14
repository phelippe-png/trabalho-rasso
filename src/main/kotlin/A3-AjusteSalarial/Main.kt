package AjusteSalarial

import java.util.*

var scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    var informouLetra = true

    while (informouLetra){
        println("Informe seu salário: ")
        var salario = readLine()?.toDoubleOrNull()
        if(salario == null){
            println("Informe apenas números!")
            continue
        }

        println("Informe o valor da porcentagem de reajuste: ")
        val valorReajuste = readLine()?.toDoubleOrNull()
        if(valorReajuste == null){
            println("Informe apenas números!")
            continue
        }

        val resultado = salario + (salario * (valorReajuste / 100))

        println("Salário base: " + salario)
        println("Salário com reajuste: " + resultado)
        informouLetra = false
    }
}
