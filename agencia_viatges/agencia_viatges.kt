
var viatgesLlista = arrayOf("1. Barcelona", "2. Granada", "3. Madrid")

fun eleccion() {
        gestioViatges()
        clientReserva()
        interficieUsuari()

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
    println(viatgesLlista.joinToString())
}