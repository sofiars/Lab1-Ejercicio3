package model

open class Empleado {
    var nombre: String = ""
    var edad: Int = 0
    var salario: Int = 0
    var plus: Int = 300

    constructor()

    constructor(nombre: String, edad: Int, salario: Int) {
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    }

}