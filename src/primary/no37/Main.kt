package primary.no37

fun main() {
    val l = listOf(3, 7, 0, 8, 4, 1, 9, 6, 5, 2)
    print("input index: ")
    val n = readLine()!!.toInt()
    println("value = ${l[l[n]]}")
}
