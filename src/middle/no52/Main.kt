package middle.no52

fun main() {
    print("input year: ")
    val y = readLine()!!.toInt()
    if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) println("${y}年は閏年である")
    else println("${y}年は閏年でない")
}
