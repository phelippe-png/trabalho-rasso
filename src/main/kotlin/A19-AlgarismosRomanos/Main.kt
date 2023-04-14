package `A19-AlgarismosRomanos`

fun main(args: Array<String>) {
    println("Conversor de Algarismos Romanos , entre com uma data em Algarismos romanos e irei converter " +
            "para número inteiro!")
    print("Algarismo Romano: ")
  var conversao = conversaoRomanoParaInt(readLine().toString())

    println("Em número inteiro fica : ${conversao}")
}  fun conversaoRomanoParaInt(valor: String): Int {
    var resultado = 0
    var i = 0

    while (i < valor.length) {
        val charCorrespondete = valoresRomanos(valor[i])
        if (i < valor.length - 1) {
            val proximoChar = valoresRomanos(valor[i + 1])
            if (proximoChar > charCorrespondete) {
                resultado += proximoChar - charCorrespondete
                i += 2
                continue
            }
        }
        resultado += charCorrespondete
        i++
    }

    return resultado
}

fun valoresRomanos(c: Char): Int {
    when (c) {
        'I' -> return 1
        'i' -> return 1
        'V' -> return 5
        'v' -> return 5
        'X' -> return 10
        'x' -> return 10
        'L' -> return 50
        'l' -> return 50
        'C' -> return 100
        'c' -> return 100
        'D' -> return 500
        'd' -> return 500
        'M' -> return 1000
        'm' -> return 1000
        else -> throw IllegalArgumentException("Caractere inválido: $c")
    }
}