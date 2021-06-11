package challenges.chapter3

import org.junit.jupiter.api.Assertions.*

internal class Test {

    @org.junit.jupiter.api.Test
    fun getPointsAndLevel_negativeNumber() {
        val message = "You have -1 point and are at the platinum level."
        assertEquals(message, getPointsAndLevel(-1))
    }

    @org.junit.jupiter.api.Test
    fun getPointsAndLevel_zero() {
        val message = "You have 0 points and are at the pearl level."
        assertEquals(message, getPointsAndLevel(0))
    }

    @org.junit.jupiter.api.Test
    fun getPointsAndLevel_one() {
        val message = "You have 1 point and are at the pearl level."
        assertEquals(message, getPointsAndLevel(1))
    }
}