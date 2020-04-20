package ABC163


fun main(args: Array<String>) {
    val numberOfEmployees = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var searedAt = 0
    (1..numberOfEmployees).forEach { employeeId ->
        var sum = 0
        for (i in searedAt until A.size) {
            if (A[i] == employeeId) {
                sum ++
            } else {
                println(sum)
                searedAt = i
                return@forEach
            }

            if (i == A.size - 1) {
                println(sum)
                searedAt = i
            }
        }
    }
}

private fun readLn(): String = readLine()!!
private fun readInt(): Int = readLn().toInt()
private fun readStrs(): List<String> = readLn().split(" ")
private fun readInts(): IntArray = readStrs().map { it.toInt() }.toIntArray()
private fun readChars(): CharArray = readStrs().map { it.single() }.toCharArray()

fun main2() {
    val n = readInt()
    val a = readInts()

    val b = IntArray(n + 1)
    for (ai in a) {
        b[ai]++
    }

    for (i in 1..n) println(b[i])
}