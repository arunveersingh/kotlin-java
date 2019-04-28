package collections

fun main(){
    var array = arrayOf(1, 3, 2)

    // creates an array of of size two with null as values
    var nullArray : Array<String?> = arrayOfNulls(2)

    println(array.size)

    println("element at location 0 is ${array[0]}")
    array.reverse()
    println("element at location 0 after reversing is ${array[0]}")

    var isContains = array.contains(5)
    println(isContains)

    array.average()

    nullArray[0] = "arun"
    nullArray[1] = "veer"

    for (e in nullArray){
        println("one of the element in nullArray is $e")
    }

    var arrayOfString : Array<String> = arrayOf("1", "3", "2")
    arrayOfString.sort()


}