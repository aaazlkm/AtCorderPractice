fun main(args: Array<String>) {
    val coin500 = readLine()?.toInt() ?: return
    val coin100 = readLine()?.toInt() ?: return
    val coin50 = readLine()?.toInt() ?: return
    val result = readLine()?.toInt() ?: return

    var count = 0

    for (i500 in 0 .. coin500) {
        for (i100 in 0 .. coin100) {
            for (i50 in 0 .. coin50) {

                if ((i500 * 500 + i100 * 100 + i50 * 50) == result) {
                    count++
                }
            }
        }
    }

    println(count)
}

