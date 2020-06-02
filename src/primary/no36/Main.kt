package primary.no36

fun main() {
    val l = listOf(3, 7, 0, 8, 4, 1, 9, 6, 5, 2)
    print("input index1: ")
    val n = readLine()!!.toInt()
    print("input index2: ")
    val m = readLine()!!.toInt()
    println("${l[n]} * ${l[m]} = ${l[n] * l[m]}")
}
