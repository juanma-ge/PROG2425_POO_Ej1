/*Ejercicio 1: Clase Cuenta Bancaria
Crea una clase CuentaBancaria con las propiedades:

titular (de tipo String).
saldo (de tipo Double).
La clase debe tener:

Un constructor que inicialice el titular con el saldo en 0 por defecto.
Métodos para:
Ingresar dinero (ingresar).
Retirar dinero (retirar). Este método debe lanzar una excepción si se intenta retirar más dinero del que hay en la cuenta.
A tener en cuenta:

El saldo no podrá ser modificado directamente desde fuera de la clase. Solo será posible su cambio mediante los métodos ingresar y retirar.
Los métodos ingresar y retirar debe mostrar un mensaje con el saldo final después de la operación.
No será posible retirar más dinero del saldo actual, ni ingresar cantidades negativas o 0. Deberá generar una excepción si ocurre esta situación.
En el programa principal:

Crea una cuenta bancaria con un titular.
Realiza un ingreso de 100.0 y un retiro de 50.0.
Intenta realizar un retiro que supere el saldo y captura la excepción.
*/

class cuentaBancaria (val titular: String) {
    var saldo: Double = 0.0
        private set(value) {
            field = value + 5
        }

    fun ingresar_dinero (cantidad: Double) {
        require(cantidad > 0) {"No puedes retirar dinero negativo."}
        saldo += cantidad
        println("Saldo actual: $saldo")
    }

    fun retirar_dinero (cantidad: Double) {
        require(cantidad <= saldo && cantidad > 0) {"La cantidad debe de ser positiva."}
        saldo -= cantidad
        println("Saldo actual: $saldo")
    }


}

fun main () {

    val cuenta1 = cuentaBancaria("Juanma")
    cuenta1.ingresar_dinero(100.0)
    cuenta1.retirar_dinero(50.0)

    try {
        cuenta1.retirar_dinero(150.0)
    } catch (e: IllegalArgumentException) {
        println("ERROR ${e.message}")
    }

}