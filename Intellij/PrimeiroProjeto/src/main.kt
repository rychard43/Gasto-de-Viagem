fun main() {
    println("Olá, mundo!")
    println(hello2("Rychard"))
    val valor = 20
    hello("meu nome",10)
}

fun hello2(nome: String) = "Olá2, ${nome}" //função de unica linha (arrow fuction)


fun hello(nome: String, valor: Int) {
    println("Olá, ${nome}")
    val s = if (valor == 10) "sim" else "nao"
}

class Nome{


}