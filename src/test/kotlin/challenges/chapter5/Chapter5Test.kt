package challenges.chapter5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Chapter5Test {

    @Test
    fun getPointsAndLevel_tests() {
        assertEquals(EXPECTED_DOUBLES, readDoubleListFromFile(FILENAME))
    }

    companion object {
        private val EXPECTED_DOUBLES = listOf(
            10.10,
            20.20,
            30.30,
            40.40,
            50.50,
            60.60,
            70.70,
            80.80,
            90.90
        )
        private const val FILENAME = "./src/test/resources/sales.txt";
    }

}