package data

/**
 * Data classes can’t be declared abstract or open so cannot used as superclass.
 * Data classes can implement interfaces and from Kotlin 1.1, they can also inherit from other classes.
 */
data class DataObject2(val type: String): IDataObject2, ClassDataObject2("value of the property") {

    override val value1: String = ""
        //get() = TODO("not implemented")

    override val bool: Boolean = false


    override fun methodInIDataObject2(){
        println("in DataObject2#methodInIDataObject2")
    }

}

/*class DataObject2 : IDataObject2 {


    internal var value1: String? = null

    internal constructor(type: String) {}

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val dataObject2Java = DataObject2Java("test")
            dataObject2Java.value1 = ""

            val dataObject2 = DataObject2("test")
            dataObject2.setValue2("value2")
        }
    }

}*/
