fun main() {
    var options: Array<String> = arrayOf("rock", "paper", "scissor")
    val compChoice = compChoice(options)
    println("comp choice is $compChoice")
    val userChoice = getUserChoice(options)
    println("user choice is $userChoice")

    printUserChoiceAndCompChoice(userChoice, compChoice)
}

fun printUserChoiceAndCompChoice(userChoice: String, compChoice: String) {

    var result: String = "unknown"

    if(userChoice == compChoice){
        result = "tie!"
    }

    /**
     * Leaving the logic of comparing the values
     */

    println("result is $result")

}

fun compChoice(options: Array<String>) : String {
    return options[(Math.random()*options.size).toInt()]
}

fun getUserChoice(options: Array<String>) : String {
    println("choose from below ${options.size} values")
    println("# loop type one #")
    for(i in 0..(options.size-1)){
        println(options[i])
    }
    println("# loop type two #")
    for(i in 0 until options.size){
        println(options[i])
    }
    println("# loop type three #")
    for(i in options.size - 1 downTo 0){
        println(options[i])
    }
    println("# loop type four #")
    for(i in 0 until options.size step 1){
        println(options[i])
    }
    println("# loop type five #")
    for(item in options){
        println(item)
    }
    println("# loop type six #")
    for(item in options.withIndex()){
        println("item at index ${item.index} is ${item.value}")
    }
    println("# loop type seven #")
    for((index, value) in options.withIndex()){
        println("item at index $index is $value")
    }

    var validChoice  = false
    var userInput = ""

    while (!validChoice){

        val input = readLine()
        if (!input.isNullOrBlank()){
            userInput = input
            validChoice = true
        }
    }
    return userInput
}