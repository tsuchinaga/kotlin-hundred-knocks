package middle.no44

fun main() {
    print("何円? ")
    val yen = readLine()!!.toInt()

    print("1ドルは何円? ")
    val dy = readLine()!!.toInt()

    println("${yen}円は${yen / dy}ドル${yen % dy * 100 / dy}セント")
}
