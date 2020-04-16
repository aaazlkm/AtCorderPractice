package ARC004

// https://atcoder.jp/contests/arc004/tasks/arc004_1

data class Position(
    val x: Int,
    val y: Int
)

fun main(args: Array<String>) {
    val positions = readInputs()

    val longestDistance = calculateLongestDistance(positions)

    println(longestDistance)
}

fun readInputs(): List<Position> {
    val n = readLine()?.toInt() ?: return listOf()
    val positions = mutableListOf<Position>()

    for (i in 0 until n) {
        val input = readLine()?.split(" ")?.map { it.toInt() } ?: return listOf()
        positions.add(Position(input[0], input[1]))
    }

    return positions
}

fun calculateLongestDistance(positions: List<Position>): Double {
    var longestDistance = 0.0

    for (i in 0 until positions.size) {
        for (j in 1 + i until positions.size) {
            val distance = calculateDistance(positions[i], positions[j])
            if (longestDistance < distance) longestDistance = distance
        }
    }

    return longestDistance
}

fun calculateDistance(positionA: Position, positionB: Position): Double {
    return Math.sqrt((pow(positionA.x - positionB.x) + pow(positionA.y - positionB.y)).toDouble())
}

fun pow(a: Int): Int {
    return a * a
}