package primary.no20

fun main() {
    print("input 1st value: ")
    val a = readLine()!!.toInt()
    print("input 2nd value: ")
    val b = readLine()!!.toInt()
    println("result: ${a / b}")
    println("result: ${(a / b) * b}")
}
