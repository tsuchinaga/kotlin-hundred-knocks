package middle.no57

fun main() {
    val n = readLine()!!.toInt()
    val totals = mutableListOf(0, 0, 0)
    val scores = mutableListOf<Int>()

    while (true) {
        val line = readLine() ?: break
        val score = line.trim().split(" ").map { it.toInt() }
        repeat(3) { i -> totals[i] += score[i] }
        scores.add(score.sum())
    }
    println("平均点 英語:${totals[0] / n}, 数学: ${totals[1] / n}, 国語:${totals[2] / n}")
    scores.forEachIndexed { i, s -> println("${i}: $s") }
}
