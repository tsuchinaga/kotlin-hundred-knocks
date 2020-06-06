package advanced.no86

fun main() {
    print("石の数を入力してください(10以上): ")
    var n = readLine()!!.trim().toInt()
    println("石の数: $n")

    var p = 0
    if (n % 4 == 1) {
        println("あなたからどうぞ")
    } else {
        p = 1
        println("ではわたしから")
    }

    while (true) {
        if (p == 1) {
            val m = (n - 1) % 4
            println("${m}個取ります")
            n -= m
        } else {
            print("何個取る(1~3個)? ")
            val m = readLine()!!.trim().toInt()
            if (m < 1 || 3 < m) continue
            n -= m
        }

        println("石の数: $n")
        if (n <= 1) break
        p = (p + 1) % 2
    }

    println("わたしの勝ち")
}
