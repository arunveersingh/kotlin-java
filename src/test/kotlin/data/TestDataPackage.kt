package data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class TestDataClassConcepts{

    @Test
    fun testDataObjectCreation(){

        var dObject = DataObject("first")
        Assertions.assertNotNull(dObject)
        Assertions.assertEquals(dObject.type, "first")

    }

    @Test
    fun testDataObject2Creation(){
        var dObject2 = DataObject2("first")
        println("value of value1 is ${dObject2.value1}")
    }

}