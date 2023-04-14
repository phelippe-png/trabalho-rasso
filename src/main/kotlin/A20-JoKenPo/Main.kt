package JoKenPo

fun main(args: Array<String>) {
    println("------ JoKenPo ------")
    println("Jogador Um Escolha uma jogada: \n")
    println("1.Pedra")
    println("2.Papel")
    println("3.Tesoura\n")

    var jogadorUm: String
    var jogadorDois: String
    do {
        print("Jogador Um : ")
        jogadorUm = readLine()!!
        var opcaoValida: Boolean = false

        if (jogadorUm == "1" || jogadorUm == "2" || jogadorUm == "3") {
            opcaoValida = true
        } else{
            println("Opção Invalida entre com um valor de 1 a 3!")
        }
    } while (opcaoValida == false)

    println("Jogador Dois Escolha uma jogada: \n")
    println("1.Pedra")
    println("2.Papel")
    println("3.Tesoura")

    do {
        print("Jogador Dois : ")
        jogadorDois = readLine()!!
        var opcaoValida: Boolean = false

        if (jogadorDois == "1" || jogadorDois == "2" || jogadorDois == "3") {
            opcaoValida = true
        } else{
            println("Opção Invalida entre com um valor de 1 a 3!")
        }
    } while (opcaoValida == false)

    val resultado = when {
        jogadorUm == jogadorDois -> "Empate"
        jogadorUm == "1" && jogadorDois == "3" -> "Jogador Um venceu"
        jogadorUm == "3" && jogadorDois == "2" -> "Jogador Um venceu"
        jogadorUm == "2" && jogadorDois == "1" -> "Jogador Um venceu"
        else -> "Jogador Dois venceu"
    }
    println("Resultado: $resultado")
}
