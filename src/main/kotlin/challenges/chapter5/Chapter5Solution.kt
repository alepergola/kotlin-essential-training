package challenges.chapter5

import java.io.File

fun readDoubleListFromFile(filename: String): List<Double> =
    File(filename)
        .readLines()
        .mapNotNull { it.toDoubleOrNull() }
        .sorted()
        .toList()