package `A6-SalarioLiquidoProfessor`

fun main(args: Array<String>) {
    println("Bem vindo a calculadora de Salário Liquido, por favor professor(a) insira os dados abaixo:")
    print("Valor da hora-aula:")
    var valorHora : Int? = readLine()?.toInt()
    print("Horas trabalhadas no mês:")
    var horasTrabalhadas : Int? = readLine()?.toInt()
    print("Percentual de desconto do INSS:")
    var descontoInss : Double  = readLine()!!.toDouble()
    var salarioBruto: Int? = calcSalarioBruto(valorHora, horasTrabalhadas)
    var desconto : Double = salarioBruto!! * (descontoInss / 100)
    var salarioLiquido : Double = calcSalarioLiquido(salarioBruto , desconto)
    println("\nSeu salario Bruto é de : ${salarioBruto}")
    println("Seu salario Liquido é de : ${salarioLiquido}")
    }

fun calcSalarioBruto(valorHora: Int?, horasTrabalhadas: Int?): Int {
    return valorHora!! * horasTrabalhadas!!
}
fun calcSalarioLiquido(salarioBruto: Int?, desconto: Double?): Double {
    return salarioBruto!! - desconto!!
}
