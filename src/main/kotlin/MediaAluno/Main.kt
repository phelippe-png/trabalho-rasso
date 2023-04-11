package MediaAluno

fun main(args: Array<String>) {
    println("Informe a primeira nota: ")
    val primeiraNota = readLine()?.toInt()!!

    println("Informe a segunda nota: ")
    val segundaNota = readLine()?.toInt()!!

    println("Informe a terceira nota: ")
    val terceiraNota = readLine()?.toInt()!!

    println("Informe a quarta nota: ")
    val quartaNota = readLine()?.toInt()!!

    val resultado = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4

    if (resultado >= 50)
        println("Aluno APROVADO.")
    else
        println("Aluno REPROVADO.")

    println("Média do aluno: ${resultado}")
}