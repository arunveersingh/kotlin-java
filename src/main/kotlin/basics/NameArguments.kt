package basics

fun joinToString(
    argument1: String = "arun ",
    argument2: String = "veer ",
    argument3: String = "singh"): String {

    return argument1 + argument2 + argument3
}

fun main(){
    println(joinToString(argument1 = "anuj "))
}
