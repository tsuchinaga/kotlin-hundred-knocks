package basic.no19

fun main() {
    val ary = arrayOfNulls<Int?>(5)
    ary.forEachIndexed { i, _ ->
        print("input number: ")
        ary[i] = readLine()!!.toInt()
    }
    ary.forEach { n -> println(n) }
}
