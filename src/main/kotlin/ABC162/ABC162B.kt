package ABC162

fun main(args: Array<String>) {
    val n = readLine()!!.toLong()

    val numbers = mutableListOf<Long>()
    (1 .. n).forEach { num ->
        when {
            (num % 5L == 0L) || (num % 3L == 0L) -> {}
            else -> {
                numbers.add(num)
            }
        }
    }

    val sum = numbers.sum()
    println(sum)
}