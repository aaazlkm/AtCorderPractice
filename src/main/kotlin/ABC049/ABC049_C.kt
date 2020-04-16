package ABC049



fun mains(args: Array<String>) {
    val words = listOf("dream", "dreamer", "erase", "eraser")
    val s = readLine()!!
    val sb = StringBuilder(s)
    while (sb.isNotEmpty()) {
        var deleted = false
        for (word in words) {
            if (sb.endsWith(word)) {
                sb.delete(sb.length - word.length, sb.length)
                deleted = true
            }
        }
        if (!deleted) break
    }
    println(if (sb.isEmpty()) "YES" else "NO")
}

fun main(args: Array<String>) {
    val additionForT = listOf("dream", "dreamer", "erase", "eraser")

    val s = readLine()!!

    val flag = checkCanSame(s, additionForT)

    if (flag) {
        println("YES")
    } else {
        println("NO")
    }
}

fun checkCanSame(sb: String, additionForT: List<String>): Boolean {
    val s = StringBuilder(sb)
    while (s.isNotEmpty()) {
        var isDeleted = false
        for (add in additionForT) {
            if (s.endsWith(add)) {
                s.delete(s.length - add.length, s.length)
                isDeleted = true
            }
        }
        if (!isDeleted) break
    }
    return s.isEmpty()
}
