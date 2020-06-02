package primary.no25

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    when {
        n < -10 -> println("range 1")
        n < 0 -> println("range 2")
        else -> println("range 3")
    }
}
