package advanced.no85

fun main() {
    print("石の数を入力してください(10以上): ")
    var n = readLine()!!.trim().toInt()
    println("石の数: $n")

    var p = 0
    while (true) {
        println("プレイヤー${p + 1}の番です")
        print("何個取る(1~3個)? ")
        val m = readLine()!!.trim().toInt()
        if (m < 1 || 3 < m) continue

        n -= m
        println("石の数: $n")

        if (n <= 1) break
        p = (p + 1) % 2
    }

    if (n == 1) println("プレイヤー${p + 1}の勝ち")
    else println("プレイヤー${p + 1}の反則負け")
}
