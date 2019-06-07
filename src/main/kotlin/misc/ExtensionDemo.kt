package misc

fun String.toAllCaps() : String = this.toUpperCase()

fun main(){
    var name: String = "arunveersingh"
    println("output of invoking extension function toAllCaps is ${name.toAllCaps()}")
}