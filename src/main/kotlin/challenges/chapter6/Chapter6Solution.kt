package challenges.chapter6

private fun replicate(func: (Int, String) -> String, numberOfTimes: Int, stringToReplicate: String): String {
    return func(numberOfTimes, stringToReplicate)
}

fun main(numberOfTimes: Int, stringToReplicate: String): String {
    val replicateFunction =
        { number: Int, string: String -> (1..number).map { string }.filterNot { it.isEmpty() }.joinToString("\n") }

    return replicate(replicateFunction, numberOfTimes, stringToReplicate)
}