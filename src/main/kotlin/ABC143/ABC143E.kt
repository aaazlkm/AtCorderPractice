package ABC143

fun main(args: Array<String>) {
    val (N, M, L) = readLine()!!.split(" ").map { it.toInt() }
    val pointMap = readPointMap(M)
    val Q = readLine()!!.toInt()
    val questions = readQuestions(Q)
    println("pointMap: $pointMap")
    println("questions: $questions")

    for (question in questions) {
        val sumOfSupply = calculateMinSupplyTimes(pointMap, question, L)
        println("sumOfSupply: $sumOfSupply")
    }
}

private fun readPointMap(M: Int): Map<Int, Map<Int, Int>> {
    var map = mutableMapOf<Int, MutableMap<Int, Int>>()
    for (i in 0 until M) {
        val (A, B ,length) = readLine()!!.split(" ").map { it.toInt() }
        map = addLengthAtoB(map, A, B, length)
        map = addLengthAtoB(map, B, A, length)
    }
    return map
}

private fun addLengthAtoB(map: MutableMap<Int, MutableMap<Int, Int>>, A: Int, B: Int, length: Int): MutableMap<Int, MutableMap<Int, Int>> {
    if (map[A] == null) {
        map[A] = mutableMapOf(B to length)
    } else {
        map[A]!![B] = length
    }
    return map
}

private fun readQuestions(Q: Int): List<Pair<Int, Int>> {
    val questions = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until Q) {
        val (s, t) = readLine()!!.split(" ").map { it.toInt() }
        questions.add(s to t)
    }
    return questions
}

private fun calculateMinSupplyTimes(map: Map<Int, Map<Int, Int>>, startEnd: Pair<Int, Int>, L: Int): Int {
    val roots = searchRoots(map, startEnd)
    var min = -1
    roots.forEach {
        calculateSupplyTimes(map, it, L)?.let { times ->
            min = times
        }
    }
    return min
}

private fun searchRoots(map: Map<Int, Map<Int, Int>>, startEnd: Pair<Int, Int>): List<List<Int>> {

    val from = map[startEnd.first]
    from?.keys?.forEach {
        searchRoots(map, it to startEnd.second)
    }

    searchRoot(map, startEnd.first, startEnd.second)

    return listOf()
}

private fun searchRoot(map: Map<Int, Map<Int, Int>>, start: Int, end: Int) {

}

private fun calculateSupplyTimes(map: Map<Int, Map<Int, Int>>, root: List<Int>, L: Int): Int? {
    var supplyTimes = 0
    var gas = L
    for (i in 0 .. root.size -2) {
        val consumption = map[i]?.get(i+1) ?: return null
        // 給油してもガゾリンが足りない場合は処理やめる
        if(consumption > L) return null

        if (gas > consumption) {
            gas -= consumption
        } else {
            gas = L
            supplyTimes ++
        }
    }
    return supplyTimes
}


