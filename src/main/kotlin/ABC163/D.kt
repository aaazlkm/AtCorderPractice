package ABC163

import kotlin.math.pow

fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val mod = 10.0.pow(9).toLong() + 7

    var sum = 0L
    for (k in K..(N + 1L)) {
        val min = k * (k - 1) / 2
        val max = k * (2 * N - k + 1) / 2
        sum += (max - min + 1)
    }
    println(sum % mod)
}




























