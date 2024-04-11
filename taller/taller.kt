class Taller {
    var stock: MutableList<String> = mutableListOf("rodes", "oli", "motor")

    fun exec() {
        val pieces: String = demanar_peces()
        reparar_cotxe(pieces)
    }

    fun demanar_peces() : String {
        println("Que necessitem per reparar el cotxe: ")
        var valor: String =  readLine()!!
        return valor
    }

    fun reparar_cotxe(pieces: String) {
        if (pieces in stock) {
            stock.remove(pieces)
            println("$pieces se ha eliminado del stock")
            informar()
        } else {
            renovar_stock(pieces)
        }
    }

    fun renovar_stock(pieces: String) {
        println("Se deben solicitar $pieces para el stock")
    }

    fun informar() {
        println("Reparado")
    }
}

fun main() {
    Taller().exec()
}