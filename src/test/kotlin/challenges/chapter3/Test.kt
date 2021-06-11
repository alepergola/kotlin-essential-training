package challenges.chapter3

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class Test {

    companion object {
        @JvmStatic
        fun getData(): List<Arguments> {
            return listOf(
                Arguments.of(-10000, "You have -10000 point and are at the platinum level."),
                Arguments.of(-5000, "You have -5000 point and are at the platinum level."),
                Arguments.of(-1000, "You have -1000 point and are at the platinum level."),
                Arguments.of(-1, "You have -1 point and are at the platinum level."),
                Arguments.of(0, "You have 0 points and are at the pearl level."),
                Arguments.of(1, "You have 1 point and are at the pearl level."),
                Arguments.of(500, "You have 500 points and are at the pearl level."),
                Arguments.of(999, "You have 999 points and are at the pearl level."),
                Arguments.of(1000, "You have 1000 points and are at the silver level."),
                Arguments.of(1001, "You have 1001 points and are at the silver level."),
                Arguments.of(2500, "You have 2500 points and are at the silver level."),
                Arguments.of(4999, "You have 4999 points and are at the silver level."),
                Arguments.of(5000, "You have 5000 points and are at the gold level."),
                Arguments.of(5001, "You have 5001 points and are at the gold level."),
                Arguments.of(7500, "You have 7500 points and are at the gold level."),
                Arguments.of(9999, "You have 9999 points and are at the gold level."),
                Arguments.of(10000, "You have 10000 points and are at the platinum level."),
                Arguments.of(10001, "You have 10001 points and are at the platinum level."),
                Arguments.of(1_000_000, "You have 1000000 points and are at the platinum level."),
                Arguments.of(999_999_999, "You have 999999999 points and are at the platinum level."),
            )
        }
    }

    @ParameterizedTest(name = "{index}) When getPointsAndLevel({0}) is called then return '{1}'!")
    @MethodSource("getData")
    fun getPointsAndLevel_tests(points: Int, message: String) {
        assertEquals(message, getPointsAndLevelOriginal(points))
        assertEquals(message, getPointsAndLevelSolution(points))
    }

}