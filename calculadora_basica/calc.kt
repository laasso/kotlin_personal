fun main(){
    resultat()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun resultat() {
    val num3 = llegir()
    val num4 = llegir2()
    println(sum(num3,num4))
}

fun llegir() :Int{
	val num1: Int = 10
    return num1
}

fun llegir2() :Int{
   	val num2: Int = 5
    return num2
}