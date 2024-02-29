fun main(){
    escollir()
}

fun
 escollir() {
    println("1 Sumar 2 Dividir 3 Restar 4   Multiplicar")
    val eleccio = readLine()!!.toInt()
    if (eleccio == 1) {
        resultat_suma()
    }
        else if (eleccio == 2) {
            resultat_div()
        }   
        else if (eleccio == 3) {
            resultat_resta()
        }
        else if (eleccio == 4) {
            resultat_mult()
        }
    }

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun resultat_suma() {
    val num1 = llegir()
    val num2 = llegir()
    println(sum(num1,num2))
}

fun div(a: Int, b: Int): Int {
    return a / b
}

fun resultat_div() {
    val num1 = llegir()
    val num2 = llegir()
    if (num2 != 0) {
        println(div(num1,num2))
        }
}

fun resta(a: Int, b: Int): Int {
    return a - b
}
fun resultat_resta() {
    val num1 = llegir()
    val num2 = llegir()
    println(resta(num1,num2))
}

fun multiplicar(a: Int, b: Int): Int {
    return a * b
}
fun resultat_mult() {
    val num1 = llegir()
    val num2 = llegir()
    println(multiplicar(num1,num2))
}

fun llegir() :Int{
    println("Ingresa el Valor")
    val valor = readLine()!!.toInt()    
    return valor
}

