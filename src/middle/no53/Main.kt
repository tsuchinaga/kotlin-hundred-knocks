package middle.no53

fun main() {
    print("input number: ")
    var n = readLine()!!.toInt()
    var i = 2
    val ans = mutableListOf<Int>()
    while (n > 1) {
        if (n % i == 0) {
            ans.add(i)
            n /= i
        } else i++
    }
    println(ans.joinToString(" "))
}
