package advanced.no91

fun main() {
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

    val hands = mutableListOf(cards[0], cards[1])
    while (true) {
        val sum = sum(hands.map { it.second })
        println("${hands.joinToString(" ") { num[it.second] }} : 合計${sum}")
        if (sum in 17..21) {
            println("これでOKです")
            break
        } else if (21 < sum) {
            println("バストです")
            break
        }
        println("もう一枚引きます")
        hands.add(cards[hands.count()])
    }

}

fun sum(hands: List<Int>): Int {
    val p = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10)
    var sum = hands.map { p[it] }.sum()
    val a = hands.count { it == 0 }
    repeat(a) { if (sum <= 11) sum += 10 }
    return sum
}
