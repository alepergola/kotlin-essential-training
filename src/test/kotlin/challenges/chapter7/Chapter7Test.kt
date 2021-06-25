package challenges.chapter7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Chapter7Test {

    fun nop() {
        val b = Bosco()
    }

    fun main() {
        val b1 = Bosco()
        val b2 = Bosco()
        nop()
        val b3 = Bosco()
    }

    @Test
    fun test() {
        main()
        assertEquals(4, Bosco.show())
    }

}