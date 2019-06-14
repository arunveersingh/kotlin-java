package basics

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it%2==0 }

fun main(){

    println(containsEven(listOf(1, 2, 3, 126, 555)))
    println(containsEven(listOf(43, 33)))

}