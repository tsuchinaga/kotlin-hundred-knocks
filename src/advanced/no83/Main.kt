package advanced.no83

fun main() {
    val gcp = mapOf(0 to "グー", 1 to "チョキ", 2 to "パー")

    var win = 0
    var i = 0
    while (i < 5) {
        val pc = (0..2).random()
        print("あなたの手を選んでください(グー0、チョキ1、パー2): ")
        val you = readLine()!!.trim().toInt()
        if (you < 0 || 2 < you) {
            println("そんな手はありません。あなたの負け")
        } else {
            println("コンピュータは${gcp[pc]}です")
            if (pc - you == 0) {
                println("あいこ")
                continue
            }
            when (pc - you) {
                -2, 1 -> {
                    win++
                    println("あなたの勝ち")
                }
                -1, 2 -> println("わたしの勝ち")
            }
        }
        println("あなた${win}勝、わたし${i - win + 1}勝")
        i++
    }
    if (win >= 3) println("あなたの総合勝利です。参りました。")
}
