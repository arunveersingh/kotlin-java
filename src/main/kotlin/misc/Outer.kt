package misc

class Outer {

    val x = "This is in the Outer Class"

    class Nested {
        val y = "This is in the nested class"
        fun myFun() = "This is the Nested function"
        fun getX() {
            // commented intentionally, see what happens after uncommenting this class actually. :P
            //println("Nested class cannot access the value of the outer class, e.g. $x will not compile")
        }
    }

    inner class Inner {
        val y = "This is in the inner class"
        fun myFun() = "This is the inner function"
        fun getX() = "Inner class can access the value of the outer class, e.g. $x"
    }
}

    fun main() {

        // for nested Outer is used NOT Outer()
        val nested = Outer.Nested()
        println(nested.y)
        println(nested.myFun())

        val inner = Outer().Inner()
        println(inner.y)
        println(inner.myFun())
        println(inner.getX())
    }