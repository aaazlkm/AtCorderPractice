fun main(args: Array<String>) {
    val nk = readLine()?.split(" ")?.map { it.toInt() } ?: return
    val n = nk[0]
    val k = nk[1]
    val heights = readLine()?.split(" ")?.map { it.toInt() } ?: return

    var count = 0

    heights.forEach {
        if (it >= k) count++
    }

    println(count)
}