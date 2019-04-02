class Dog(name: String, private var weight: Int, private val breed: String) {

    private val v_name = name.toUpperCase()
    private val v_weight = weight
    private val v_breed = breed

    var weightInKg: Double = weight.toDouble()
        set(value) {
            if (value > 10) field = value
        }
        get() = weight / 2.2

    private var activities = arrayOf("Walks")
    private val temperament: String = ""

    init {
        println("dog object with name $name is created $weightInKg")
    }

    fun bark(): String {
        return if (weight > 20) "yip" else "wuf"
    }

    fun getName(): String {
        return v_name
    }

    fun main(args: Array<String>) {
        var dog = Dog("", 20, "")
    }
}

fun main() {
    val dog = Dog("jacky", 20, "doberman")
    println(dog.getName())
}
