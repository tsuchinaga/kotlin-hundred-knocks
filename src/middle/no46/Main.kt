package middle.no46


fun main() {
    print("人数 ")
    val n = readLine()!!.toInt()
    val yen = when {
        n < 5 -> 600
        n < 20 -> 550
        else -> 500
    }
    println("料金 ${yen * n}")
}
