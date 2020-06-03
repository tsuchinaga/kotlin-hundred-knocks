package middle.no42

fun main() {
    val ary = arrayOfNulls<Int?>(3)
    ary.forEachIndexed { i, _ -> print("input number ${i + 1}: "); ary[i] = readLine()!!.toInt() }
    if (ary[0]!! <= ary[1]!! && ary[1]!! <= ary[2]!!) println("OK") else println("NG")
}
