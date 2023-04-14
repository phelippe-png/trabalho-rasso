package Palíndromo

fun main(args: Array<String>) {
    println("Bem vindo ao verificador de Palíndromos, escreva uma palavra ,frase ou número e irei informar " +
            "se é um Palíndromo. ")
    var palavra = readLine()!!

        if(palavra.equals(palavra.reversed(), ignoreCase = true)) {
            print("É um Palíndromo!")
        } else{
            print("Não é um Palíndromo!")
        }
}