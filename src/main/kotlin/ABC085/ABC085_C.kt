package ABC085

fun main(args: Array<String>) {
    val inputs = readLine()?.split(" ")?.map { it.toInt() } ?: return
    val n = inputs[0]
    val y = inputs[1]

    val result = searchCombination(n, y)
    println("${result.third} ${result.second} ${result.first}")
}

/**
 * 合計がsumな1000円,5000円,10000円の組み合わせを探す
 * 見つからなかった場合 -1, -1, -1を返す
 *
 * @param numberOfSheet 枚数
 * @param sum 合計
 * @return Triple<Int, Int, Int>: 1000円,5000円,10000円の枚数
 */
fun searchCombination(numberOfSheet: Int, sum: Int): Triple<Int, Int, Int> {
    for (i1000 in 0..numberOfSheet) {
        for (i5000 in 0..numberOfSheet) {
            for (i10000 in 0..(numberOfSheet - i1000 - i5000)) {
                if (i1000 + i5000 + i10000 != numberOfSheet) continue
                if ((i1000 * 1000 + i5000 * 5000 + i10000 * 10000) == sum)
                    return Triple(i1000, i5000, i10000)
            }
        }
    }
    return Triple(-1, -1, -1)
}

