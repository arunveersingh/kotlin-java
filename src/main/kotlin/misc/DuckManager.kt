package misc

object DuckManager {
    val allDucks = mutableListOf<String>()

    fun herdDucks(){
        println("herd Ducks")
    }
}

fun main(){
    DuckManager.herdDucks()
    DuckManager.allDucks.add("Duck China")
    println(DuckManager.allDucks)
}