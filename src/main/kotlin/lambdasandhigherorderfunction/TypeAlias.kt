package lambdasandhigherorderfunction

/**
 * degree to fahrenheit lambda
 */

typealias DoubleConversion = (Double) -> Double

val degreeToFahrenheitLambda : DoubleConversion = {(it * 9/5) + 32}

val kgToGramsLambda : DoubleConversion = {x -> 1000 * x}

val gramsToMillisLambda : DoubleConversion = {x -> 1000 * x}

val multiplier1000Lambda : DoubleConversion = {x -> 1000 * x}


/**
 * @param value value to be converted
 * @param lambda lambda doing conversion
 *
 * @return converted value
 */
fun conversionLambda(value : Double, lambda : DoubleConversion): Double{
    return lambda(value)
}

fun convertFiveLambda(converter: (Int) -> Double) : Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

/**
 * function to return lambda
 * @param name name of the lambda required
 * @return a lambda of type (Double) -> Double
 */
fun getLambdaByName(name: String): DoubleConversion{

    // Here if else is used as an expression
    return if (name == "kgToGrams"){
        kgToGrams
    } else {
        degreeToFahrenheit
    }
}

fun combineLambdasToGetNewLambda(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return { x -> lambda2(lambda1(x)) }
    //return { x : Double -> lambda2(lambda1(x)) }

}

fun main() {

    // way 1
    println(conversionLambda(100.00, degreeToFahrenheitLambda))

    // way 2
    println(conversionLambda(100.00, { c: Double -> (c * 9 / 5) + 32 }))

    // way 3
    println(conversionLambda(100.00) { c: Double -> (c * 9 / 5) + 32 })

    convertFiveLambda({ x -> x * 1.00 })

    convertFiveLambda { x -> x * 1.00 }

    convertFiveLambda { it * 1.00 }

    println(getLambdaByName("kgToGrams")(2.00))

    // Note: This is not a logical combination of lambdas,
    // it is just to demonstrate that lambdas can be combined to
    // generate new lambdas
    combineLambdasToGetNewLambda(degreeToFahrenheitLambda, kgToGramsLambda)

    // this one is logical combination
    println(combineLambdasToGetNewLambda(kgToGramsLambda, gramsToMillisLambda)(2.00))

    println(combineLambdasToGetNewLambda(multiplier1000Lambda, multiplier1000Lambda)(2.00))

}