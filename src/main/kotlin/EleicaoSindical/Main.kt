package EleicaoSindical

import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main(args: Array<String>) {
    println("Informe a quantidade de votos válidos para o candidato A: ")
    val votosA = readLine()?.toInt()!!

    println("Informe a quantidade de votos válidos para o candidato B: ")
    val votosB = readLine()?.toInt()!!

    println("Informe a quantidade de votos válidos para o candidato C: ")
    val votosC = readLine()?.toInt()!!

    println("Informe a quantidade de votos nulos: ")
    val votosNulos = readLine()?.toInt()!!

    println("Informe a quantidade de votos em branco: ")
    val votosEmBranco = readLine()?.toInt()!!

    val totalEleitores = votosA + votosB + votosC + votosNulos + votosEmBranco

    println("Número total de eleitores: $totalEleitores")
    println("Porcentagem de votos válidos: ${((votosA + votosB + votosC) / totalEleitores.toDouble() * 100)}%")
    println("Porcentagem de votos válidos do candidato A: ${votosA / totalEleitores.toDouble() * 100}%")
    println("Porcentagem de votos válidos do candidato B: ${votosB / totalEleitores.toDouble() * 100}%")
    println("Porcentagem de votos válidos do candidato C: ${votosC / totalEleitores.toDouble() * 100}%")
    println("Porcentagem de votos nulos: ${votosNulos / totalEleitores.toDouble() * 100}%")
    println("Porcentagem de votos em branco: ${votosEmBranco / totalEleitores.toDouble() * 100}%")
}