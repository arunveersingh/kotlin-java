class ConvertibleCar(var make:String, var model: String) : Car(make, model){


    // Either make a variable open in the parent class and override it
    // OR use init block as shown below
    //override var type: String = "Convertible"

    init {
        type = "InitConvertible"
    }

    // You can override a property’s getter and setter.
    override var carMake: String =""
        get() = carMake.toLowerCase()
        set(value) {
            field = value + "Setting Convertible Car"
        }

    // You can override a val property in the superclass with a var property in the subclass.
    override var color: String = "Convertible Color"

    // You can override a property’s type with one of the superclass version’s subtypes.


}