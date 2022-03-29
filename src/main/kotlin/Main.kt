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

    println("Empleado comercial 1: " + comercial1.salario)
    println("Empleado comercial 2: " + comercial2.salario)
    println("Empleado repartidor 3: " + repartidor1.salario)
    println("Empleado repartidor 4: " + repartidor2.salario)

    println("----------------------------------------")
    println("            SALARIO CON EL PLUS         ")
    println("----------------------------------------")
    comercial1.calcularSalario()
    comercial2.calcularSalario()

    repartidor1.calcularSalario()
    repartidor2.calcularSalario()

    println("Empleado comercial 1: " + comercial1.salario)
    println("Empleado comercial 2: " + comercial2.salario)
    println("Empleado repartidor 3: " + repartidor1.salario)
    println("Empleado repartidor 4: " + repartidor2.salario)
}