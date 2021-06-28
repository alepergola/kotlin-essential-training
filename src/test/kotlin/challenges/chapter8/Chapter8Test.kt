package challenges.chapter8

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Chapter8Test {

    companion object {
        private const val FILENAME = "./src/test/resources/the_whale.txt"

        private const val TOTAL_LINES = 22925

        private const val FILE_CONTENT = "[Moby Dick by Herman Melville 1851]\n" +
                "\n" +
                "\n" +
                "ETYMOLOGY.\n" +
                "\n" +
                "(Supplied by a Late Consumptive Usher to a Grammar School)\n" +
                "\n" +
                "The pale Usher--threadbare in coat, heart, body, and brain; I see him\n" +
                "now.  He was ever dusting his old lexicons and grammars, with a queer\n" +
                "handkerchief, mockingly embellished with all the gay flags of all the\n"
    }

    @Test
    fun test_zero_lines() {
        assertEquals("", readFile(FILENAME, 0))
    }

    @Test
    fun test_one_line() {
        assertEquals("[Moby Dick by Herman Melville 1851]\n", readFile(FILENAME, 1))
    }

    @Test
    fun test_ten_lines() {
        assertEquals(FILE_CONTENT, readFile(FILENAME, 10))
    }

    @Test
    fun test_all_lines() {
        assertEquals(TOTAL_LINES, readFile(FILENAME).lines().size)
    }

    @Test
    fun test_async() {
        val result = runBlocking {
            readFileAsync(FILENAME).await()
        }
        assertEquals(TOTAL_LINES, result.lines().size)
    }


}