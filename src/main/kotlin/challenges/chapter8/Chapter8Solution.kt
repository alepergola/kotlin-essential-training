package challenges.chapter8

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File


fun readFileAsync(fileName: String): Deferred<String> {
    return runBlocking {
        async { readFile(fileName) }
    }
}

fun readFile(fileName: String, numberOfLines: Int = -1): String {
    var lines = File(fileName).readLines()

    if (numberOfLines >= 0) {
        lines = lines.subList(0, numberOfLines)
    }

    return lines.joinToString("") { "${it}\n" }
}