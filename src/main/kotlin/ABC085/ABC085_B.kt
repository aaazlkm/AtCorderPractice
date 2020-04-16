package ABC085

fun main(args: Array<String>) {
    val n = readLine()?.toInt() ?: return
    val mochi = mutableSetOf<Int>()
    for (i in 0 until n) {
        val input = readLine()?.toInt() ?: return
        mochi.add(input)
    }
    println(mochi.size)
}