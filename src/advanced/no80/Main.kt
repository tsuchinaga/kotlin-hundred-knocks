package advanced.no80

fun main() {
    print("2つの値をスペースで区切って入力: ")
    var (a, b) = readLine()!!.trim().split(" ").map { it.toInt() }
    while (true) {
        if (a % b == 0) break
        val c = a % b
        a = b
        b = c
    }
    if (b == 1) println("互いに素") else println("互いに素でない")
}
