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
    fun test_no_instance() {
        assertEquals(0, Bosco.show())
    }

    @Test
    fun test_one_instance() {
        nop()
        assertEquals(1, Bosco.show())
    }

    @Test
    fun test_multiple_instance() {
        main()
        assertEquals(4, Bosco.show())
    }

}