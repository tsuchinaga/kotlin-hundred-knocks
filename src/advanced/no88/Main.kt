package advanced.no88

fun main() {
    val t = (1..99).random()
    var i = 1
    while(true) {
        print("数を入力: ")
        val n = readLine()!!.toInt()
        if (t < n) println("それより小さいです")
        else if (t > n) println("それより大きいです")
        else break
        i++
    }

    println("正解!! ${i}回でクリア")
}
