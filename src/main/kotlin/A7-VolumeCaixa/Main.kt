package VolumeCaixa

fun main(args: Array<String>) {

    println("Olá bem-vindo ao calculo de volume de uma Caixa !")
    println("Por favor insira os seguintes valores para o calculo: ")
    print("\nComprimento:")

    var  comprimento =  readLine()?.toInt() ?: 0

    print("\nLargura:")

    var largura = readLine()?.toInt() ?: 0

    print("\nAltura:")

    var altura = readLine()?.toInt() ?: 0

    var volume = comprimento * largura * altura;

    println("O volume da Caixa é: ${volume}")
}
