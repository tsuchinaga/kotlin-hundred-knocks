package advanced.no82

fun main() {
    var list = listOf(1)
    println(list.joinToString(" "))

    repeat(14) {
        val newList = mutableListOf<Int>()
        val nums = listOf(0) + list + listOf(0)
        repeat(nums.size - 1) { i -> newList.add(nums[i] + nums[i + 1]) }
        list = newList
        println(list.joinToString(" "))
    }
}
