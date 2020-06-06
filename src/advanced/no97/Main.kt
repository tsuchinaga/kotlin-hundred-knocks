package advanced.no97

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
}

fun printCard(card: List<Int>) {
    repeat(5) { i -> println(card.subList(i * 5, i * 5 + 5).joinToString("\t")) }
}
