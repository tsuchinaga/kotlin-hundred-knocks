package primary.no22

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    if (n <= -10 || 10 <= n) println("OK")
}
