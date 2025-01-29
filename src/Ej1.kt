class Rectángulo (val base: Double, val altura: Double) {

    init {
        require(base > 0) {"La base debe ser mayor que 0."}
        require(altura > 0) {"La altura debe ser mayor que 0."}
    }

    fun calcularArea(): Double {
        return base * altura
    }
    fun calcularPerimetro (): Double {
        return (base * 2) + (altura * 2)
    }
}

fun main () {

    val Rectángulo1 = Rectángulo(5.0, 3.0)
    val Rectángulo2 = Rectángulo(8.0, 5.0)
    val Rectángulo3 = Rectángulo(10.0, 6.0)

}
