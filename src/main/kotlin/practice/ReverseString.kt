package practice

fun reverseString(string: String): String = string.reversed()

fun reverseStringRaw(string: String): String{

    /*val list = mutableListOf<Char>()
    string.toCharArray().asIterable().forEach { x -> list.add(x)}
    for (element in list){
        println(element)
    }*/


    var charArray = string.toCharArray()
    var rString = ""

    for ( i in charArray.size - 1 downTo 0){
        rString = "$rString${charArray[i]}"
    }

    return rString
}

fun main(){
    println(reverseString("arunveersingh"))
    println(reverseStringRaw("arunveersingh"))

}