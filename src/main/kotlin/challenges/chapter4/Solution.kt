package challenges.chapter4

fun removeDuplicate(list: List<String>): List<String> {
    return HashSet(list).toList().sorted()
}