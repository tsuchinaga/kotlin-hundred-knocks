package basic.no18

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    val list = (0..9).map { n }
    list.forEach { i -> println(i) }
}
