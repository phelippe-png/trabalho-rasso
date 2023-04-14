package JoKenPoLagartoSpock

fun main(args: Array<String>) {
    println("------ JoKenPo Lagarto Spock ------")
    println("Jogador Um Escolha uma jogada: \n")
    println("1.Pedra")
    println("2.Papel")
    println("3.Tesoura")
    println("4.Lagarto")
    println("5.Spock\n")

    var jogadorUm: String
    var jogadorDois: String
    do {
        print("Jogador Um : ")
        jogadorUm = readLine()!!
        var opcaoValida: Boolean = false

        if (jogadorUm == "1" || jogadorUm == "2" || jogadorUm == "3" || jogadorUm == "4" || jogadorUm == "5") {
            opcaoValida = true
        } else{
            println("Opção Invalida entre com um valor de 1 a 5!")
        }
    } while (opcaoValida == false)

    println("Jogador Dois Escolha uma jogada: \n")
    println("1.Pedra")
    println("2.Papel")
    println("3.Tesoura")
    println("4.Lagarto")
    println("5.Spock\n")

    do {
        print("Jogador Dois : ")
        jogadorDois = readLine()!!
        var opcaoValida: Boolean = false

        if (jogadorDois == "1" || jogadorDois == "2" || jogadorDois == "3" || jogadorDois == "4" || jogadorDois == "5") {
            opcaoValida = true
        } else{
            println("Opção Invalida entre com um valor de 1 a 5!")
        }
    } while (opcaoValida == false)

    val resultado = when {
        jogadorUm == jogadorDois -> "Empate"
        jogadorUm == "1" && (jogadorDois == "3" || jogadorDois == "4") -> "Jogador 1 venceu"
        jogadorUm == "2" && (jogadorDois == "1" || jogadorDois == "4") -> "Jogador 1 venceu"
        jogadorUm == "3" && (jogadorDois == "2" || jogadorDois == "4") -> "Jogador 1 venceu"
        jogadorUm == "4" && (jogadorDois == "2" || jogadorDois == "5") -> "Jogador 1 venceu"
        jogadorUm == "5" && (jogadorDois == "1" || jogadorDois == "3") -> "Jogador 1 venceu"
        else -> "Jogador 2 venceu"
    }

    println("Resultado: $resultado")
}
