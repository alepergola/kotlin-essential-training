package challenges.chapter4

fun removeDuplicate(list: List<String>): List<String> {
    return list.toSortedSet().toList()
}