package advanced.no90

fun main() {
    val num = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    val p = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10)

    val cards = mutableListOf<Pair<Int, Int>>()
    repeat(52) { i -> cards.add(Pair(i / 13, i % 13)) }

    repeat(100_000) {
        val i = it % 52
        val j = (0..51).random()
        val tmp = cards[i]
        cards[i] = cards[j]
        cards[j] = tmp
    }

    val hands = listOf(cards[0], cards[1])
    println("${hands.joinToString(" ") { num[it.second] }} : 合計${hands.map { if (p[it.second] == 1) 11 else p[it.second] }.sum()}")
}
