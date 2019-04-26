package nullsandexceptions.letusage

import base.A

class UsageLet {


}

fun main(){
    var arg1 : A = A()
    arg1.attribute = "test_attribute1"

    var arg2: A = A()

    // Test the usage of !!
    // It explicitly throw a null pointer exception
    var rArg1 = arg1.attribute
    var rArg2 = arg2.attribute

    var rArg3 = arg1?.attribute
    var rArg4 = arg2.attribute!!.length

    println(rArg1)
    println(rArg2)
    println(rArg3)
    println(rArg4)

}