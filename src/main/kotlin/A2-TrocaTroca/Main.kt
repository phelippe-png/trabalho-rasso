package TrocaTroca

fun main(args: Array<String>) {
    println("Informe um valor para o A: ")
    var valorA = readLine()

    println("Informe um valor para o B: ")
    var valorB = readLine()

    println("")
    println("Valor do A original: ${valorA}")
    println("Valor do B original: ${valorB}")

    val valorAGuardado = valorA
    valorA = valorB
    valorB = valorAGuardado

    println("")
    println("Valor do A alterado: ${valorA}")
    println("Valor do B alterado: ${valorB}")
}
