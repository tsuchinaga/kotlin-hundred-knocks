package middle.no54

fun main() {
    var max = -1
    var min = -1
    while (true) {
        val n = readLine()?.toInt() ?: break
        if (max == -1 || max < n) max = n
        if (min == -1 || n < min) min = n
    }
    println("最小値 = ${min}, 最大値 = $max")
}
