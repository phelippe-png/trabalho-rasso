package FizzBuzz

fun main(args: Array<String>) {
    var listNumeros: MutableList<Int> = ArrayList()
    var primeiroNumero: Int
    var segundoNumero: Int

    do {
        println("Informe o 1° número: ")
        primeiroNumero = readLine()?.toIntOrNull()!!

        if (primeiroNumero == null)
            println("Informe apenas números!")
    } while (primeiroNumero == null)

    do {
        println("Informe o 2° número: ")
        segundoNumero = readLine()?.toIntOrNull()!!

        if (segundoNumero == null)
            println("Informe apenas números!")
    } while (segundoNumero == null)

    var comportamento = ComportamentoFizzBuzz()
    println(comportamento.fizzBuzz(primeiroNumero, segundoNumero))
}
