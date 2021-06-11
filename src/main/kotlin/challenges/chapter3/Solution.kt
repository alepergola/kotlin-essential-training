package challenges.chapter3

fun getPointsAndLevelSolution(cardPoints: Int): String {

    val cardLevel: String = when (cardPoints) {
        in 0..999 -> "pearl"
        in 1000..4999 -> "silver"
        in 5000..9999 -> "gold"
        else -> "platinum"
    }

    val plural = if (cardPoints > 1 || cardPoints == 0) "s" else ""
    return ("You have $cardPoints point$plural and are at the $cardLevel level.")
}