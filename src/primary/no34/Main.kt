package primary.no34

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    (1..9).forEach { i -> if (i < n || n + 1 < i) println(i) }
}
