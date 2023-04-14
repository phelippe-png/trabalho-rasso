package OrdenandoInteiros

fun main(args: Array<String>) {
    val x = IntArray(12)

    println("Bem vindo ao programa de Ordenação de Inteiros")

    for (i in x.indices) {
        print("Digite o ${i + 1}º número: ")
        x[i] = readLine()!!.toInt()
    }

        x.sort()
    print("Números ordenados em ordem crescente: ")
    for (i in 0..11) {
    print("${x[i]}  ")
    }




}