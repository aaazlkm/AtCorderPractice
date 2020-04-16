fun main(args: Array<String>) {
    val input = readLine()?.split(" ")?.map { it.toInt() } ?: return
    val n = input[0]
    val a = input[1]
    val b = input[2]

    // 総和
    var sum = 0

    for(i in 0..n) {
        val flag = checkCondition(i, a, b)
        if(flag) sum += i
    }

    println(sum)
}

fun checkCondition(integer: Int, start: Int, end: Int): Boolean {
    val integerStr = integer.toString()
    var sum = 0
    for(i in 0 until integerStr.length) {
        sum += Integer.parseInt(integerStr[i].toString())
    }
    return sum in start..end
}