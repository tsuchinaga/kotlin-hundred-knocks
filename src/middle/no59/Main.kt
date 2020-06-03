package middle.no59

fun main() {
    println("1つめの行列")
    val ary1 = mutableListOf<List<Int>>()
    repeat(3) { ary1.add(readLine()!!.trim().split(" ").map { it.toInt() }) }

    println("2つめの行列")
    val ary2 = mutableListOf<List<Int>>()
    repeat(3) { ary2.add(readLine()!!.trim().split(" ").map { it.toInt() }) }

    println("和")
    repeat(3) { i -> println("${ary1[i][0] + ary2[i][0]}\t${ary1[i][1] + ary2[i][1]}\t${ary1[i][2] + ary2[i][2]}") }
}
