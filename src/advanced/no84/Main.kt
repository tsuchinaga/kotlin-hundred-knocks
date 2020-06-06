package advanced.no84

fun main() {
    val mark = listOf("スペード", "ハート", "ダイヤ", "クローバー")
    val num = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")

    val cards = mutableListOf<Pair<Int, Int>>()
    repeat(52) { i -> cards.add(Pair(i / 13, i % 13)) }

    repeat(100_000) {
        val i = it % 52
        val j = (0..51).random()
        val tmp = cards[i]
        cards[i] = cards[j]
        cards[j] = tmp
    }
    cards.forEach { println("${mark[it.first]}${num[it.second]}") }
}
