//fun main(args: Array<String>){
fun main(){

    val x = 1
    val y = 2
    if(x>y)
        println("x is greater than y")
    println("x is lesser than y")
    print("test done")


    val z = if(x > y) println(x) else println(y)
    println(" z is $z")

    val valOfZ = if(x > y) x else y
    println(" valOfZ is $valOfZ")

    println(if(x>4) "greater" else "not")

    var dog = Dog("name", 20, "breed")
    println("weight of dog is ${dog.weightInKg}")

}