package challenges.chapter3

// TODO: replace this if with a when
// bonus points for using ranges!

fun getPointsAndLevelOriginal(cardPoints: Int): String {

    val cardLevel: String = if (cardPoints >= 0 && cardPoints < 1000) {
        "pearl"
    } else if (cardPoints >= 1000 && cardPoints < 5_000) {
        "silver"
    } else if (cardPoints >= 5_000 && cardPoints < 10_000) {
        "gold"
    } else {
        "platinum"
    }

    val plural = if (cardPoints > 1 || cardPoints == 0) "s" else ""
    return ("You have $cardPoints point$plural and are at the $cardLevel level.")
}