package collections

fun main(){
    var list = mutableListOf("arun", "veer")

    var listOfInt  = mutableListOf<Int>()

    var listRandom : List<String>
    listRandom = mutableListOf("a", "b", "c")

    println(listRandom)

    for (e in list){
        println("one of the element in list is $e")
    }

    if (list.contains("arun")){
        println("index of arun is ${list.indexOf("arun")}")
    }

    list.add(0, "singh")


    for (e in list){
        println("one of the element in list is $e")
    }

    if (list.contains("arun")){
        println("index of arun is ${list.indexOf("arun")}")
    }

    list.add("this is name")
    for (e in list){
        println("one of the element in list is $e")
    }

    if (list.contains("arun")){
        println("index of arun is ${list.indexOf("arun")}")
    }

    // remove and check the size
    println("current size of list is ${list.size}")
    list.remove("arun")
    println("now, size of list is ${list.size}")

    list.sort()

}