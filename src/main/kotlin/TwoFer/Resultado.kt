package TwoFer

fun ExibirMensagem(nome: String): String{
    if (nome == "")
        return "Um para você, um para mim."
    else
        return "Um para ${nome}, um para mim."
}