package advanced.no94

fun main() {
    val t = (1..4).map { (0..9).random() }.toMutableList()

    print("4桁の数字を入力: ")
    val s = readLine()!!.trim().split("").filter { it != "" }.map { it.toInt() }.toMutableList()

    println("target = ${t.joinToString("")}")

    var hit = 0
    repeat(4) { i ->
        if (t[i] >= 0 && s[i] >= 0 && t[i] == s[i]) {
            hit++
            t[i] = -1
            s[i] = -1
        }
    }

    println("$hit hit")
}
