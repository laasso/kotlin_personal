var viatgesLlista = mapOf(1 to "1. Barcelona", 2 to "2. Granada" ,3 to "3. Madrid")

fun eleccion() {
        interficieUsuari()
        gestioViatges()
        clientReserva()
        

    }

fun gestioViatges() {
    println(viatgesLlista)

}

fun clientReserva () {
    println(viatgesLlista)

}

fun interficieUsuari() {
    mostrarDestinacio()

}

fun main(){
    eleccion()
}

fun mostrarDestinacio() {
    println("Les destinacions disponibles son:")
    println(viatgesLlista.values)
}

fun informacioPersonal() {

}