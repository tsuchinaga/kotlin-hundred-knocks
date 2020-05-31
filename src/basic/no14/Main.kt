package basic.no14

fun main() {
    print("input number: ")
    (readLine()!!.toInt() downTo 0).forEach { i -> println("$i") }
}
