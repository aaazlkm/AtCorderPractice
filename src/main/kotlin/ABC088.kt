fun main(args: Array<String>) {
    val n = readLine()?.toInt() ?: return
    val cards = readLine()?.split(" ")?.map { it.toInt() }?.toMutableList() ?: return

    cards.sort()
    cards.reverse()

    var aSum = 0
    var bSum = 0

    for (i in 0 until cards.size) {
        if (i % 2 == 0) {
            aSum += cards[i]
        } else {
            bSum += cards[i]
        }
    }
    println(aSum - bSum)
}