package natan.collections

fun main() {
    val values = IntArray(11)
    val i = 3
    for (x in values.indices){
        values[x] = x * i
        println("$i x $x = " + values[x])
    }
}