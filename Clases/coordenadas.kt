class Coordenadas constructor(var x: Int, var y: Int, constructor())

constructor() {
    this.x = 0
    this.y = 0

}

fun more_dreta() {
    this.x += 1
}

fun more_esquerra() {
    this.x -= 1
}

fun more_amunt() {
    this.y += 1
}

fun more_avall() {
    this.y -= 1
}

class Main {
    constructor() 
}