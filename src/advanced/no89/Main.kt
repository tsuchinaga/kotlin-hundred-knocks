package advanced.no89

fun main() {
    var min = 1
    var max = 99

    var i = 1
    while(true) {
        val n = (max - min + 1) / 2 + min
        print("${n}ですか? ")
        when (readLine()!!.toInt()) {
            -1 -> max = n - 1
            0 -> {
                println("${i}回で当てました")
                return
            }
            1 -> min = n + 1
        }
        i++
    }
}
