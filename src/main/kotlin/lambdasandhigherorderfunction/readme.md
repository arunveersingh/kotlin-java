1. Define a lambda
2. Create a higher-order functions

-----
A lambda’s type is also known as a function type. 
e.g. (parameters) -> return_type

A lambda with a single Int parameter that returns a String like this:

val msg = { x: Int -> "The value is $x" }

its type is: 
(Int) -> String

val add: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

---

A function that uses a lambda as a parameter or return value is known as a higher-order function.

---

Combining lambdas

---

typealias for lambda's type

e.g. 

typealias DoubleConversion = (Double) -> Double