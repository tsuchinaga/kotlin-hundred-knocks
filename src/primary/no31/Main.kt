package primary.no31

fun main() {
    print("input number: ")
    val n = readLine()!!.toInt()
    println(("***** ".repeat(n / 5) + "*".repeat(n % 5)).trim())
}
