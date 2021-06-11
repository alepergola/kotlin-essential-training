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
                Arguments.of(-1, "You have -1 point and are at the platinum level."),
                Arguments.of(0, "You have 0 points and are at the pearl level."),
                Arguments.of(1, "You have 1 point and are at the pearl level."),
            )
        }
    }

    @ParameterizedTest(name = "{index}) When getPointsAndLevel({0}) is called then return '{1}'!")
    @MethodSource("getData")
    fun getPointsAndLevel_tests(points: Int, message: String) {
        assertEquals(message, getPointsAndLevel(points))
    }

}