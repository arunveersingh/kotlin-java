package misc

fun <T> valToList(vararg vals: T): MutableList<T>{
    val list = mutableListOf<T>()
    for (v in vals){
        list.add(v)
    }
    return list
}

fun main(){
    val list = valToList(1, 2, 3, 4, 5, 6)
    println(list)

    val list1To5 = arrayOf(1, 2, 3, 4, 5)
    val list0To6 = valToList(0, *list1To5, 6)
    println("list of 0 to 6 is $list0To6")
}