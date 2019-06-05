package nullsandexceptions.nullvalues

import java.lang.Exception

class Wolf {

    var hunger = 10
    var food = "meat"

    fun eat() {
        println("Wolf is eating $food")
    }

}

class MyWolf {

    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }

}

class Duck(val height: Int? = null ){
    fun quack(){
        println("Quack!, Quack!")
    }
}

class MyDucks(var myDucks: Array<Duck?>){

    fun quack(){
        for (duck in myDucks){
            duck?.let {
                it.quack()
            }
        }
    }

    fun totalDuckHeight(): Int {
        var h: Int = 0
        for (duck in myDucks){
            h += duck?.height ?: 0
        }
        return h
    }
}

fun getAlphaWolf(): Wolf? {
    return Wolf()
}

fun main(){
    var w: Wolf? = Wolf()
    if (w!=null){
        w.eat()
    }
    var x = w?.hunger
    println("value of x is $x")

    var y = w?.hunger ?: -1
    println("value of y is $y")

    var myWolf : MyWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("value of my myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("hi", "hello", null)
    for (item in myArray){
        item?.let {
            println(it)
        }
    }

    getAlphaWolf()?.let {
        it.eat()
    }

    w = null

    // demonstrate try catch
    try {
        var z = w!!.hunger
    }catch (e: Exception){
        e.printStackTrace()
    } finally {
        println("inside finally")
    }


    // This will throw exception as w is null
    // Exception like:
    // Exception in thread "basics.main" kotlin.KotlinNullPointerException
    //	at nullsandexceptions.nullvalues.WolfKt.basics.main(Wolf.kt:55)
    //	at nullsandexceptions.nullvalues.WolfKt.basics.main(Wolf.kt)
    var z = w!!.hunger

}