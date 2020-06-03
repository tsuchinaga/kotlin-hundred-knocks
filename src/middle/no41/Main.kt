package middle.no41

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    if (0 < n && n < 10) println("$n is a single figure.") else println("$n is not a single figure.")
}
