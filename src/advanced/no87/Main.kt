package advanced.no87

fun main() {
    print("誕生日をYYYYMMDDの形式で入力してください: ")
    val n = readLine()!!.trim().split("").filter { it != "" }.map { it.toInt() }.sum()
    if (n % 11 == 0) println("運命数は$n")
    else println("運命数は${n.toString().split("").filter { it != "" }.map { it.toInt() }.sum()}")
}
