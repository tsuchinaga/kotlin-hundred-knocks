package primary.no24

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    if ((-10 <= n && n < 0) || 10 <= n) println("OK") else println("NG")
}
