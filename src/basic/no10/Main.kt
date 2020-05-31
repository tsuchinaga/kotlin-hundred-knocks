package basic.no10

fun main() {
    print("input number: ")
    var n = readLine()!!.toInt()
    n = if (n >= 0) n else n * -1
    println("absolute value is $n")
}
