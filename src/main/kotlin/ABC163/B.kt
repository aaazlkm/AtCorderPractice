package ABC163

fun main(args: Array<String>) {
    val (numberOfSummerHolidays, numberOfHomeWorks) = readLine()!!.split(" ").map{ it.toInt() }
    val homeworkCosts = readLine()!!.split(" ").map { it.toInt() }
    val sumOfHomeworkCost = homeworkCosts.sum()

    if (numberOfSummerHolidays >= sumOfHomeworkCost) {
        println(numberOfSummerHolidays - sumOfHomeworkCost)
    } else {
        println(-1)
    }
}