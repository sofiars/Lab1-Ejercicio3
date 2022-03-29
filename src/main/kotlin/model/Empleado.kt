package model

abstract class Empleado {
    protected var nombre: String = ""
    protected var edad: Int = 0
    protected var salario: Int = 0
    val plus: Int = 300

    constructor()

    constructor(nombre: String, edad: Int, salario: Int) {
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    }

    abstract fun PLUS()
    override fun toString(): String {
        return "Empleado(salario=$salario)"
    }


}