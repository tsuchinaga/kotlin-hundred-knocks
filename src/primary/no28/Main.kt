package primary.no28

fun main() {
    print("input number: ")
    var f = 1
    (1..readLine()!!.toInt()).forEach { n -> f *= n }
    println("factorial = $f")
}
