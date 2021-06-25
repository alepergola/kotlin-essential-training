package challenges.chapter6

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

internal class Chapter6Test {

    companion object {
        private const val TEST_STRING = "Be Cool."

        @JvmStatic
        fun getData(): List<Arguments> {
            return listOf(
                Arguments.of("", 0, TEST_STRING),
                Arguments.of("", 100, ""),
                Arguments.of(TEST_STRING, 1, TEST_STRING),
                Arguments.of("${TEST_STRING}\n${TEST_STRING}\n${TEST_STRING}", 3, TEST_STRING),
            )
        }
    }

    @ParameterizedTest(name = "{index}) When call replicate({0}, {1}) then prints '{1}' {0} times!")
    @MethodSource("getData")
    fun getPointsAndLevel_tests(expectedString: String, numberOfTimes: Int, stringToReplicate: String) {
        assertEquals(expectedString, main(numberOfTimes, stringToReplicate))
    }

}