package SomandoNaturais

fun main(args: Array<String>) {
    print("Digite o primeiro número do intervalo: ")
    val inicioIntervalo = readLine()?.toInt() ?: 0

    print("Digite o último número do intervalo: ")
    val fimIntervalo = readLine()?.toInt() ?: 0

    if (inicioIntervalo > fimIntervalo) {
        println("O primeiro número do intervalo deve ser menor ou igual ao último número do intervalo!")
        return
    }

    var soma = 0
    var quantidadeNumerosIntervalo = 0
    for (i in inicioIntervalo..fimIntervalo) {
        quantidadeNumerosIntervalo++
        soma += i
    }

    if (quantidadeNumerosIntervalo >= 100) {
        println("Intervalo: $inicioIntervalo a $fimIntervalo")
        println("Soma: $soma")
    } else
        println("Informe um intervalo do ínicio ao fim que de no mínimo 100 números!")
}