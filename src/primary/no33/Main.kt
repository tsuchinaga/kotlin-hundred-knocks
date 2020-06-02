package primary.no33

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    (1..9).forEach { i -> if (i != n) println(i) }
}
