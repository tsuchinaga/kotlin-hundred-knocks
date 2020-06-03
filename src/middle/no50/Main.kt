package middle.no50

fun main() {
    var i = 1
    while (i <= 100) {
        var out = ""
        if (i % 3 == 0) out += "foo"
        if (i % 5 == 0) out += "bar"
        if (out == "") out = i.toString()
        println(out)
        i++
    }
}
