package nullsandexceptions.exceptions

import javax.swing.tree.ExpandVetoException

class ExceptionsExample {

    fun stringToNumber(str: String) {
        val x = str.toDouble()
        println(x)
        println("stringToNumber has ended")
    }

    fun throwException(str: String) {
        println("now throwing MyException")
        throw MyException(str)
    }

}

fun main() {
    ExceptionsExample().stringToNumber("5")

    /**
     * This string cannot be converted to Int but will work if converted to Double
     *
     * Exception in thread "basics.main" java.lang.NumberFormatException: For input string: "5.67"
    at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.lang.Integer.parseInt(Integer.java:580)
    at java.lang.Integer.parseInt(Integer.java:615)
    at nullsandexceptions.exceptions.ExceptionsExample.stringToNumber(ExceptionsExample.kt:6)
    at nullsandexceptions.exceptions.ExceptionsExampleKt.basics.main(ExceptionsExample.kt:14)
    at nullsandexceptions.exceptions.ExceptionsExampleKt.basics.main(ExceptionsExample.kt)
     */
    ExceptionsExample().stringToNumber("5.67")

    try{
        ExceptionsExample().stringToNumber("a")
    }catch (e: NumberFormatException){
        e.printStackTrace()
    }finally {
        println("completed gracefully")
    }

    ExceptionsExample().throwException("exception message")


}