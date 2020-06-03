package middle.no58

fun main() {
    val ary = arrayOfNulls<Int>(5)
    ary.forEachIndexed { i, _ ->
        print("input data[${i}]: ")
        ary[i] = readLine()!!.toInt()
    }
    ary.forEach { n -> println("$n\t:${("***** ".repeat(n!! / 5) + "*".repeat(n % 5)).trim()}") }
}
