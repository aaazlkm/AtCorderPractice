package ABC086


fun main(args: Array<String>) {
    val n = readLine()?.toInt() ?: return
    val coordinates = mutableListOf<List<Int>>()
    coordinates.add(listOf(0, 0, 0))
    for (i in 0 until n) {
        val input = readLine()?.split(" ")?.map { it.toInt() } ?: return
        coordinates.add(input)
    }

    if (canTravel(coordinates)) {
        println("Yes")
    } else {
        println("No")
    }
}

private fun canTravel(coordinates: MutableList<List<Int>>): Boolean {
    for (i in 1 until coordinates.size) {
        val times = coordinates[i][0] - coordinates[i - 1][0]
        val coordinateFrom = Pair(coordinates[i - 1][1], coordinates[i - 1][2])
        val coordinateTo = Pair(coordinates[i][1], coordinates[i][2])
        val flag = canMoveFromAtoBInTimes(times, coordinateFrom, coordinateTo)
        if (!flag) return flag
    }
    return true
}

private fun canMoveFromAtoBInTimes(times: Int, coordinateFrom: Pair<Int, Int>, coordinateTo: Pair<Int, Int>): Boolean {
    val disX = coordinateTo.first - coordinateFrom.first
    val disY = coordinateTo.second - coordinateFrom.second

    val distance = abs(disX) + abs(disY)

    if (distance > times) return false

    return ((times - distance) % 2 == 0)
}

private fun abs(a: Int): Int {
    return if (a < 0) -a else a
}