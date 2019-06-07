package junit

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TotallerTest {

    @Test
    fun `should be able to add 3 and 4`(){

        val totaller = Totaller()
        Assertions.assertEquals(3, totaller.add(3))
        Assertions.assertEquals(7, totaller.add(4))
        Assertions.assertEquals(7, totaller.total)
    }
}