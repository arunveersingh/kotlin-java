package lambdasandhigherorderfunction

var lambdaAdd5 = { x: Int -> x + 5 }

var lambdaAdd5It : (Int) -> Int = {it + 5}

var lambdaSum = { x: Int, y: Int -> x + y }

var lambdaReturnPow = { "pow!"}

val add: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

val myLambda: () -> Unit = { println("hi")}

class NoName {

}

fun main(){
    println(lambdaAdd5.invoke(3))
    println(lambdaAdd5It.invoke(3))
    lambdaAdd5(3)

    myLambda.invoke()
    myLambda()
}