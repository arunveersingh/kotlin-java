package data

import org.junit.Assert
import org.junit.Test

class TestDataClassConcepts{

    @Test
    fun testDataObjectCreation(){

        var dObject = DataObject("first")
        Assert.assertNotNull(dObject)
        Assert.assertEquals(dObject.type, "first")

    }

    @Test
    fun testDataObject2Creation(){
        var dObject2 = DataObject2("first")
        println("value of value1 is ${dObject2.value1}")
    }

}