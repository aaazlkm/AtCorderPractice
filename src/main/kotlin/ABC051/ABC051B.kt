package ABC051

fun main(args: Array<String>) {
    val (K, S) = readLine()!!.split(" ").map { it.toInt() }

    val sum = calculateSumOfCombination(K, S)

    println(sum)
}

fun calculateSumOfCombination(K :Int, S: Int): Int {
    var sum = 0
    for (x in 0 .. K) {
        for (y in 0 .. K) {
            if (S - x - y in 0..K) sum ++
        }
    }
    return sum
}