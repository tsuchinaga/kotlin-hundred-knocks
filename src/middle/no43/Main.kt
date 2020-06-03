package middle.no43

fun main() {
    val ary = arrayOfNulls<Int?>(3)
    ary.forEachIndexed { i, _ -> print("input number ${'a' + i}: "); ary[i] = readLine()!!.toInt() }
    val d = ary[1]!! * ary[1]!! - 4 * ary[0]!! * ary[2]!!
    when {
        d < 0 -> println("2つの虚数解")
        d > 0 -> println("2つの実数解")
        else -> println("重解")
    }
}
