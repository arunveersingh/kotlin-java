package data


interface IDataObject2 {

    val value1: String

    val bool: Boolean

    fun methodInIDataObject2()
}


/*test
interface IDataObject2 {
    companion object {

        val value1 = ""

        val bool = false
    }
}*/

/*var a: A = A()
a.string = "test1"

var b: A = A()

// this will print value of a.string i.e test1

// this will print value of a.string i.e test1
// Note: inside let <code>it<code> it means value of a.string,
// no need to to a.string again as at P1
a.string?.let {
    println(it)
}

if(b.string!=null){
    println(b.string)uipv`
}

b.string?.let {
    println(it)
}*/
