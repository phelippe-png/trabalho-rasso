package ScrabbleScore

fun main(args: Array<String>) {
    println("Bem vindo ao jogo ScrabbleScore , entre com uma palavra e irei dizer quantos pontos essa palavra possui!")
    var palavra : String = readLine().toString().replace(" ", "") ?: ""
    var score : Int = 0
    for (i in 0 .. palavra.length - 1){
        if( palavra[i].equals('a', true) ||  palavra[i].equals('e', true)||
            palavra[i].equals('i', true) ||  palavra[i].equals('o', true) ||
            palavra[i].equals('u', true) || palavra[i].equals('l', true) ||
            palavra[i].equals('n', true) || palavra[i].equals('r', true) ||
            palavra[i].equals('s', true) || palavra[i].equals('t', true)){
            score += 1
        }
        if(  palavra[i].equals('d', true) || palavra[i].equals('g', true)){
            score += 2
        }

        if(  palavra[i].equals('b', true) || palavra[i].equals('c', true)||
            palavra[i].equals('m', true) || palavra[i].equals('p', true)){
            score += 3
        }
        if( palavra[i].equals('f', true) || palavra[i].equals('h', true)||
            palavra[i].equals('v', true) || palavra[i].equals('w', true)||
            palavra[i].equals('y', true)){
            score += 4
        }
        if( palavra[i].equals('k', true)) {
            score += 5
        }
        if( palavra[i].equals('j', true) || palavra[i].equals('x', true)) {
            score += 8
        }
        if( palavra[i].equals('q', true) || palavra[i].equals('z', true)) {
            score += 10
        }

    }
    println("O Score dessa palavra é de : ${score}")
}