package ABC143

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val sticks = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var sumCombination = 0
    for (i in 0 until sticks.size) {
        for (j in i + 1 until sticks.size) {
            for (k in sticks.size - 1 downTo j + 1) {
                val a = sticks[i]
                val b = sticks[j]
                val c = sticks[k]
                if (c < a + b) {
                    sumCombination += k - j
                    break
                }
            }
        }
    }

    println(sumCombination)
}