package junit

import org.junit.Assert
import org.junit.Test

class TotallerTest {
    @Test
    fun `should be able to add 3 and 4`(){

        val totaller = Totaller()
        Assert.assertEquals(3, totaller.add(3))
        Assert.assertEquals(7, totaller.add(4))
        Assert.assertEquals(7, totaller.total)
    }
}