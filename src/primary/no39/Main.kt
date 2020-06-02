package primary.no39

fun main() {
    val l = listOf(3, 7, 0, 8, 4, 1, 9, 6, 5, 2)
    repeat(9) { i -> println(l[i] - l[i + 1]) }
}
