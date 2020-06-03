package middle.no56

fun main() {
    print("input number: ")
    var n = readLine()!!.toInt()

    val ary = arrayOfNulls<Int>(16)
    ary.forEachIndexed { i, _ -> ary[i] = 0 }

    var i = 15
    while (n > 0) {
        ary[i] = n % 2
        n /= 2
        i--
    }
    println(ary.joinToString(""))
}
