import kotlin.arrayOf
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
    println("1.Registrar-se")
    println("2.Mostrar Destinacions")
    println("3.Reservar")
    println("4.Informacio Reserves")
    val eleccio = readLine()!!.toInt()
    if (eleccio == 1) {
        informacioPersonal()
    }
        else if (eleccio == 2) {
            mostrarDestinacio()
            
        }   
        else if (eleccio == 3) {
            clientReserva()
        }
        else if (eleccio == 4) {
            mostrarDestinacio()
        }
    }




fun main(){
    eleccion()
}

fun mostrarDestinacio() {
    var viatges = declararViatges()
    println("Les destinacions disponibles son:")
    for (desti in viatges) {
        println(desti[0])
    }
    
}

fun informacioPersonal() {
    println("Nom:")
    val nom = readLine()!!
    println("Cogonom:")

    val cognom = readLine()!!
    println("Telefon:")

    val numero = readLine()!!.toInt()
    println(" ")
    println("Aquestes son les teves dades?")
    println("Nom: $nom")
    println("Cogonom: $cognom")
    println("Telefon: $numero")



    }

fun declararViatges(): MutableList<Array<String>> {
    val viatge = arrayOf("Barcelona", "2025", "December"," 2 Hours")
    val viatge2 = arrayOf("Granada", "2024", "August"," 1 Hours")
    val viatge3 = arrayOf("Madrid", "2024", "May"," 3 Hours")
    var viatgesLlista = mutableListOf(viatge, viatge2, viatge3)
    return viatgesLlista
}
