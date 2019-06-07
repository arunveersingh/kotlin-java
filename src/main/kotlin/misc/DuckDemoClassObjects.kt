package misc

import nullsandexceptions.nullvalues.Duck

class DuckDemoClassObjects {
    object DuckFactory{
        fun create() : Duck = Duck()
    }
}

fun main(){
    val newDuck = DuckDemoClassObjects.DuckFactory.create()
    println("new Duck is $newDuck")
}