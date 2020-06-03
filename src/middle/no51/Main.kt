package middle.no51

fun main() {
    print("input money: ")
    val y = readLine()!!.toInt()
    println("100円玉${y / 100}枚, 10円玉${(y % 100) / 10}枚, 1円玉${(y % 100) % 10}枚")
}
