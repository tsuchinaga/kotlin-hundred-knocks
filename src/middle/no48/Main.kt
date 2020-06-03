package middle.no48

fun main() {
    print("input number: ")
    var n = readLine()!!.toInt()
    var i = 0
    while (n > 1) {
        i++
        if (n % 2 == 0) n /= 2 else n = n * 3 + 1
        println("${i}: $n")
    }
}
