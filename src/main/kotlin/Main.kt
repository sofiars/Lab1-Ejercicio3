import model.Comercial
import model.Repartidor

fun main(args: Array<String>) {
    var comercial1 = Comercial("Franklin", 21, 5000, 200.01)
    var comercial2 = Comercial("Mireya", 37, 7000, 300.01)


    val repartidor1 = Repartidor("Sofia", 21, 1900,  "Zona 2")
    val repartidor2 = Repartidor("Daniel", 23, 3000,  "Zona 3")


    println("----------------------------------------")
    println("          SALARIO SIN EL PLUS           ")
    println("----------------------------------------")

    println("Comercial 1: " + comercial1.toString())
    println("Comercial 2: " + comercial2.toString())
    println("Repartidor 3: " + repartidor1.toString())
    println("Repartidor 4: " + repartidor2.toString())

    println("----------------------------------------")
    println("            SALARIO CON EL PLUS         ")
    println("----------------------------------------")
    comercial1.PLUS()
    comercial2.PLUS()

    repartidor1.PLUS()
    repartidor2.PLUS()

    println("Comercial 1: " + comercial1.toString())
    println("Comercial 2: " + comercial2.toString())
    println("Repartidor 3: " + repartidor1.toString())
    println("Repartidor 4: " + repartidor2.toString())
}