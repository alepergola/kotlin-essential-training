package challenges.chapter8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Chapter8Test {

    companion object {
        private const val FILENAME = "./src/test/resources/the_whale.txt";
    }

    @Test
    fun test_zero_lines() {
        assertEquals("", readFileAsync(FILENAME, 0))
    }

}