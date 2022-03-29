package model

class Comercial: Empleado {
    var comision: Double = 0.0
    lateinit var empleado: Empleado


    constructor(nombre: String, edad: Int, salario: Int, comision: Double) : super(nombre, edad, salario) {
        this.comision = comision
    }


    fun calcularSalario(){
        if(this.edad > 30 && this.comision > 200){
            this.salario += this.plus
        }
    }
}