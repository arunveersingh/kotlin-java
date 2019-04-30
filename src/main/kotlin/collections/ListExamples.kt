package collections

fun main(){
    var list = listOf("arun", "veer")

    var listOfInt  = listOf<Int>()

    var listRandom : List<String>
    listRandom = listOf("a", "b", "c")

    println(listRandom)

    for (e in list){
        println("one of the element in list is $e")
    }

    if (list.contains("arun")){
        println("index of arun is ${list.indexOf("arun")}")
    }

}