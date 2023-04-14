package ConversãoEmDólar


fun main(args: Array<String>) {

    println("Bem-vindo ao programa de cotação de Real para Dólar.")
    print("\nInsira o valor da cotação do Dólar atualmente:")
    var cotacao = readLine()?.toDouble() ?: 0.0
    print("\nInsira o valor que você possui em Real:")
    var saldo = readLine()?.toDouble() ?: 0.0
    var valorConvertidoDólar = saldo / cotacao

    println("Esse é o seu saldo em Real convertido para Dólar: US$${valorConvertidoDólar}")

}