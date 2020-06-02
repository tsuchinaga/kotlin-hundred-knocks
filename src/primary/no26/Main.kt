package primary.no26

fun main() {
    print("input number: ")
    println(
        when (readLine()!!.toInt()) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            else -> "others"
        }
    )
}
