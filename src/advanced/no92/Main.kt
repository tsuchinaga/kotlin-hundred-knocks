package advanced.no92

fun main() {
    (1..50).forEach { i -> println("${if (i % 3 == 0 || i.toString().contains("3")) "aho " else ""}$i") }
}
