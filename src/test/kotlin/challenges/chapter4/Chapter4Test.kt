package challenges.chapter4

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

internal class Chapter4Test {

    companion object {
        @JvmStatic
        fun getData(): List<Arguments> {
            return listOf(
                Arguments.of(emptyList<String>(), emptyList<String>()),
                Arguments.of(listOf(""), listOf("")),
                Arguments.of(listOf("a"), listOf("a")),
                Arguments.of(listOf("a", "b", "c"), listOf("a", "b", "c")),
                Arguments.of(listOf("b", "b", "b"), listOf("b")),
                Arguments.of(listOf("a", "c", "a", "b", "c", "b"), listOf("a", "b", "c")),
                Arguments.of(
                    listOf("apple", "biscuit", "apple", "cat", "cat", "cat", "dog", "elephant", "fox", "goat", "elephant"),
                    listOf("apple", "biscuit", "cat", "dog", "elephant", "fox", "goat")
                ),
            )
        }
    }

    @ParameterizedTest(name = "{index}) When removeDuplicate({0}) the list became '{1}'!")
    @MethodSource("getData")
    fun getPointsAndLevel_tests(originalList: List<String>, expectedList: List<String>) {
        assertEquals(expectedList, removeDuplicate(originalList))
    }

}