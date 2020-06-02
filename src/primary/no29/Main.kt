package primary.no29

fun main() {
    var sum = 0
    repeat(5) {
        print("input number: ")
        sum += readLine()!!.toInt()
    }
    println("sum = $sum")
}
