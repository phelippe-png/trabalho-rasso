package VelocidadeProjetil

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var informouValorCorreto = false

    do {
        try {
            println("Digite a distância percorrida em quilômetros: ")
            val distanciaKm = readLine()?.toDoubleOrNull()

            println("Digite o tempo de percurso em minutos: ")
            val tempoMinutos = readLine()?.toDoubleOrNull()

            val velocidadeMps = (distanciaKm!! * 1000) / (tempoMinutos!! * 60)

            println("A velocidade do projétil é de ${velocidadeMps.roundToInt()} metros por segundo.")

            informouValorCorreto = true
        } catch (ex: Exception) {
            println("Informe apenas valores e valores maior que 0!")
        }
    } while (!informouValorCorreto)
}