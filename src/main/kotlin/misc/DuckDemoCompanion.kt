package misc

import nullsandexceptions.nullvalues.Duck

class DuckDemoCompanion {

    // it is equivalent to static methods in Java
    companion object{
        fun create() : Duck = Duck()
    }
}

fun main(){
    val newDuck = DuckDemoCompanion.create()
    println("new Duck is $newDuck")

    // get hold of Companion
    val x = DuckDemoCompanion.Companion

}