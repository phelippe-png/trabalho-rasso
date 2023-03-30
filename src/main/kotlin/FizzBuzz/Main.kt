package FizzBuzz

fun main(args: Array<String>) {
    var listNumeros: MutableList<Int>

    do {
        println("Quantos números deseja informar: ")
        var intervaloNumeros = readLine()?.toIntOrNull()

        if (intervaloNumeros == null)
            println("Informe apenas números!")
    } while (intervaloNumeros == null)

    while(listNumeros.count()){

    }

    println("Informe o primeiro número: ")
    val numero = readLine()?.toIntOrNull()
    listNumeros.add()
}
