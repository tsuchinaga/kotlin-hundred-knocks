package basic.no15

fun main() {
    print("input number: ")
    for (i in 0..readLine()!!.toInt() step 2) {
        println(i)
    }
}
