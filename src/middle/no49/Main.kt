package middle.no49

fun main() {
    for (i in 1..9) println((1..9).map { j -> i * j }.joinToString("\t"))
}
