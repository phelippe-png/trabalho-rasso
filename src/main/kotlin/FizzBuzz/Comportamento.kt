package FizzBuzz

class ComportamentoFizzBuzz {
    fun fizzBuzz(primeiroNumero: Int, segundoNumero: Int): String {
        var intervalos = ""

        for (i in primeiroNumero..segundoNumero) {
            if (i % 3 == 0 && i % 5 == 0) intervalos += "FizzBuzz"
            else if (i % 3 == 0) intervalos += "Fizz"
            else if (i % 5 == 0) intervalos += "Buzz"
            else intervalos += "${i}"

            if (i < segundoNumero)
                intervalos += ", "
        }

        return intervalos
    }
}