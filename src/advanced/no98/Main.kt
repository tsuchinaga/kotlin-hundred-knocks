package advanced.no98

fun main() {
    val nums = mutableListOf<Int>()
    (1..75).forEach { i -> nums.add(i) }
    repeat(100_000) {
        val i = it % 75
        val j = (0..74).random()
        val n = nums[i]
        nums[i] = nums[j]
        nums[j] = n
    }

    val card = mutableListOf<Int>()
    repeat(25) { i -> if (i == 12) card.add(0) else card.add(nums[i]) }
    printCard(card)

    var i = 1
    while (true) {
        print("${i++}個目: ")
        val n = readLine()!!.trim().toInt()
        val idx = card.indexOf(n)
        if (idx >= 0) {
            println("あった!")
            card[idx] = 0
        }
        printCard(card)

        if (isBingo(card)) break
    }
    println("***** BINGO *****")
}

fun printCard(card: List<Int>) {
    repeat(5) { i -> println(card.subList(i * 5, i * 5 + 5).joinToString("\t")) }
}

fun isBingo(card: List<Int>): Boolean {
    // 横
    repeat(5) { i ->
        if (card.filterIndexed { index, _ -> index / 5 == i }.sum() == 0) return true
    }

    // 縦
    repeat(5) { i ->
        if (card.filterIndexed { index, _ -> index % 5 == i }.sum() == 0) return true
    }

    // 斜め
    if (card[0] + card[6] + card[12] + card[18] + card[24] == 0) return true
    if (card[4] + card[8] + card[12] + card[16] + card[20] == 0) return true

    return false
}
