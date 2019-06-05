package basics

open class Car(make: String, model: String) {

    open var carMake: String = ""
        get() = carMake.toUpperCase()
        set(value) {
            field = value + "Setting basics.Car"
        }
    var carModel = model
    var type: String = "basics.Car"
    open val color: String = "Color"

    fun accelerate() {
        println("accelerate a car of make $carMake and $carModel")
    }

    fun applyBrake() {
        println("apply brake a car of make $carMake and $carModel")
    }

    open fun changeTemp() {
        println("change temp of a car of make $carMake and $carModel")

    }
}