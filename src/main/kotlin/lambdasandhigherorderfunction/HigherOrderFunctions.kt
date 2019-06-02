package lambdasandhigherorderfunction

/**
 * degree to fahrenheit lambda
 */
val degreeToFahrenheit : (Double) -> Double = {(it * 9/5) + 32}

val kgToGrams : (Double) -> Double = {x -> 1000 * x}

val gramsToMillis : (Double) -> Double = {x -> 1000 * x}

val multiplier1000 : (Double) -> Double = {x -> 1000 * x}


/**
 * @param value value to be converted
 * @param lambda lambda doing conversion
 *
 * @return converted value
 */
fun convert(value : Double, lambda : (Double) -> Double): Double{
    return lambda(value)
}

fun convertFive(converter: (Int) -> Double) : Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

/**
 * function to return lambda
 * @param name name of the lambda required
 * @return a lambda of type (Double) -> Double
 */
fun getLambda(name: String): (Double) -> Double{

    // Here if else is used as an expression
    return if (name == "kgToGrams"){
        kgToGrams
    } else {
        degreeToFahrenheit
    }
}

fun combineLambdas(lambda1: (Double) -> Double, lambda2: (Double) -> Double): (Double) -> Double {
    return { x -> lambda2(lambda1(x)) }
    //return { x : Double -> lambda2(lambda1(x)) }

}

fun main(){

    // way 1
    println(convert(100.00, degreeToFahrenheit))

    // way 2
    println(convert(100.00, {c: Double -> (c * 9/5) + 32}))

    // way 3
    println(convert(100.00) { c: Double -> (c * 9/5) + 32})

    convertFive({ x -> x * 1.00})

    convertFive { x -> x * 1.00 }

    convertFive { it * 1.00 }

    println(getLambda("kgToGrams")(2.00))

    // Note: This is not a logical combination of lambdas,
    // it is just to demonstrate that lambdas can be combined to
    // generate new lambdas
    combineLambdas(degreeToFahrenheit, kgToGrams)

    // this one is logical combination
    println(combineLambdas(kgToGrams, gramsToMillis)(2.00))

    println(combineLambdas(multiplier1000, multiplier1000)(2.00))
}