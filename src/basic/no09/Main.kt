package basic.no09

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    when {
        n < 0 -> println("negative")
        n > 0 -> println("positive")
        else -> println("zero")
    }
}
