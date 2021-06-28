package challenges.chapter8

import java.io.File

fun readFile(fileName: String, numberOfLines: Int = -1): String {
    var lines = File(fileName).readLines()

    if (numberOfLines >= 0) {
        lines = lines.subList(0, numberOfLines)
    }

    return lines.joinToString("") { "${it}\n" }
}