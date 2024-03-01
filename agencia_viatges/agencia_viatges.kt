fun eleccion() {
        interficieUsuari()
        gestioViatges()
        clientReserva()
        

    }

fun gestioViatges() {
    print("1")
}

fun clientReserva () {
    print("1")
}

fun interficieUsuari() {
    mostrarDestinacio()

}

fun main(){
    eleccion()
}

fun mostrarDestinacio() {
    println("Les destinacions disponibles son:")
    declararViatges()
}

fun informacioPersonal() {
    print("1")
}

fun declararViatges(){
    val viatge = arrayOf("Barcelona", 2025, "December"," 2 Hours")
    val viatge2 = arrayOf("Granada", 2024, "August"," 1 Hours")
    val viatge3 = arrayOf("Madrid", 2024, "May"," 3 Hours")
    var viatgesLlista = mutableListOf(viatge, viatge2, viatge3)
    print(viatgesLlista.toString())

}
