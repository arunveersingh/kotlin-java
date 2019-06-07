package misc

class InfixDemo {
    infix fun myName(x: String){
        println("$x")
    }
}

fun main(){
    InfixDemo().myName("arunveersingh")

    // calling the method myName without dot operator
    InfixDemo() myName "arunveersingh"
}