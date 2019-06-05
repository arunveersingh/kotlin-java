package nullsandexceptions.exceptions

import base.A
import base.B

class Casting {

    var r: A?= B()

    /*fun test(){
        if (r is B){
            r.inB() // this won't compile as it is not share if r will be changed meanwhile as it is a mutable shared property
        }else {
            println("not inB")
        }
    }*/

    fun testAs(){
        if (r is B){
            r = null // setting it intentionally null so as to test the below code.

            // code will compile even if r is set to null, but it will through an exception while casting.
            // Exception in thread "basics.main" kotlin.TypeCastException: null cannot be cast to non-null type base.B
            //	at nullsandexceptions.exceptions.Casting.testAs(Casting.kt:21)
            //	at nullsandexceptions.exceptions.CastingKt.basics.main(Casting.kt:34)
            //	at nullsandexceptions.exceptions.CastingKt.basics.main(Casting.kt)

            var rAs = r as B
            rAs.inB()
        }else {
            println("not inB")
        }
    }

    fun testAsWithOutException(){
        if (r is B){
            r = null // setting it intentionally null so as to test the below code.

            // code will compile even if r is set to null, AND it will NOT through an exception while casting.
            var rAs = r as? B
            rAs?.inB()

        }else {
            println("not inB")
        }
    }


}

fun main(){

    //Casting().test()
    //Casting().testAs()
    Casting().testAsWithOutException()

}