package model

class Repartidor: Empleado {

    var zona: String = ""


    constructor(nombre: String, edad: Int, salario: Int, zona: String) : super(nombre, edad, salario) {
        this.zona = zona
    }

    override fun PLUS(){
        if(this.edad < 25 && this.zona == "Zona 3"){
            this.salario += this.plus
        }
    }
}