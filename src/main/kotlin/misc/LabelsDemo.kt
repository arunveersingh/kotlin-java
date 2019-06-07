package misc


fun myFun(){
    listOf("a", "b", "c", "d").forEach{
        if(it == "c") return
        println(it)
    }
    println("finished myFun")
}

fun myFunWithLoopLabel(){
    listOf("a", "b", "c", "d").forEach myLoop@{
        if(it == "c") return@myLoop
        println(it)
    }
    println("finished myFunWithLoopLabel")
}

fun myFunWithLoopWithoutLabel(){
    listOf("a", "b", "c", "d").forEach{
        if(it == "c") return@forEach
        println(it)
    }
    println("finished myFunWithLoopWithoutLabel")
}

fun main(){

    var x = 0
    var y = 0
    outer@ while (x<20){
        while (y<20){
            x++
            y++
            println("In inner while")
            break@outer
        }
        println("In outer while")
    }

    myFun()
    myFunWithLoopLabel()
    myFunWithLoopWithoutLabel()
}