package primary.no32

fun main() {
    (1..20).forEach { i -> if (i % 5 == 0) println("bar") else println(i) }
}
