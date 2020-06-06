package advanced.no96

fun main() {
    val target = (1..4).map { (0..9).random() }.joinToString("")

    var cnt = 0
    while (true) {
        cnt++
        println("${cnt}回目")
        print("4桁の数字を入力: ")
        val s = readLine()!!.trim().split("").filter { it != "" }.map { it.toInt() }.toMutableList()

        val t = target.split("").filter { it != "" }.map { it.toInt() }.toMutableList()
        var hit = 0
        repeat(4) { i ->
            if (t[i] >= 0 && s[i] >= 0 && t[i] == s[i]) {
                hit++
                t[i] = -1
                s[i] = -1
            }
        }

        var blow = 0
        repeat(4) { i ->
            repeat(4) { j ->
                if (t[i] >= 0 && s[j] >= 0 && t[i] == s[j]) {
                    blow++
                    t[i] = -1
                    s[j] = -1
                }
            }
        }

        if (hit == 4) break
        println("$hit hit, $blow blow")
    }

    println("正解")
}
