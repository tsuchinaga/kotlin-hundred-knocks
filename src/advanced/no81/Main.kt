package advanced.no81

fun main() {
    print("3つの値を入力: ")
    println(readLine()!!.trim().split(" ").map { it.toInt() }.sorted()[1])
}
