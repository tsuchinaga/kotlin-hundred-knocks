package advanced.no93

fun main() {
    print("start: ")
    val start = readLine()!!.toInt()
    print("end: ")
    val end = readLine()!!.toInt()
    (start..end).forEach { i -> println("${if (i % 3 == 0 || i.toString().contains("3")) "aho " else ""}$i") }
}
