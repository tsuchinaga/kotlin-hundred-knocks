package basic.no05

fun main() {
    print("input 1st number: ")
    val a = readLine()!!.toInt()
    print("input 2nd number: ")
    val b = readLine()!!.toInt()
    println("和: ${a + b}")
    println("差: ${a - b}")
    println("積: ${a * b}")
    println("商: ${a / b}, 余り: ${a % b}")
}
