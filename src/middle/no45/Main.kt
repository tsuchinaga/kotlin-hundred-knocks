package middle.no45

import kotlin.math.ceil


fun main() {
    print("距離 ")
    val d = readLine()!!.toInt() - 1700
    val yen = if (d <= 0) 610
    else 610 + ceil(d.toFloat() / 313).toInt() * 80
    println("金額 $yen")
}
