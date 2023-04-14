package ConversãoEmReal

fun main(args: Array<String>) {

    println("Bem-vindo ao programa de cotação de Dólar para Real.")
    print("\nInsira o valor da cotação do Dólar atualmente:")
    var cotacao = readLine()?.toDouble() ?: 0.0
    print("\nInsira o valor que você possui em Dólar:")
    var saldo = readLine()?.toDouble() ?: 0.0
    var valorConvertidoReal = saldo * cotacao

    println("Esse é o seu saldo em Dólar convertido para Real: R$${valorConvertidoReal}")

}