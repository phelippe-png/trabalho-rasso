package VelocidadeProjetil

import java.util.Scanner
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var informouValorCorreto = false
    var velocidadeMps: Double = 0.0

    do {
        try {
            println("Digite a distância percorrida em quilômetros: ")
            val distanciaKm = readLine()?.toDouble()

            println("Digite o tempo de percurso em minutos: ")
            val tempoMinutos = readLine()?.toDouble()

            // realiza o cálculo da velocidade em metros por segundo
            velocidadeMps = (distanciaKm!! * 1000) / (tempoMinutos!! * 60)

            informouValorCorreto = true
        } catch (ex: Exception) {
            println("Informe apenas valores e valores maior que 0!")
        }
    } while (!informouValorCorreto)

    // exibe o resultado
    println("A velocidade do projétil é de ${velocidadeMps.roundToInt()} metros por segundo.")
}