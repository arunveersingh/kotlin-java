package lambdasandhigherorderfunction

fun `function accepting lambda`(x: String, converter: (String) -> Int) {
    println("output is ${converter.invoke(x)}")
}


fun main() {

    // assigning a lambda to var
    // defining the type of lambda
    // defining a lambda
    val lengthOfString: (String) -> Int = { string -> string.length }

    // for a single argument lambda 'it' can be used
    val lengthOfString2: (String) -> Int = { it.length }

    // lambda type is inferred by the type of string and return part
    val lengthOfString3 = { string: String -> string.length }

    // using/invoking lambda
    println(lengthOfString.invoke("test"))

    val myLambda: () -> Unit = { println("printing, that's it!!") }

    `function accepting lambda`("arun", { x -> x.length })

    `function accepting lambda`("arun", { x -> x.length + 1 })

    `function accepting lambda`("arunveer", lengthOfString)

    // I don't know whats the benefit of this ... don't go bananas over it
    `function accepting lambda`("arun") { x -> x.length + 1 }

}
