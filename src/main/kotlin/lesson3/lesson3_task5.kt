fun main() {
    val historyOfMoves = "D2-D4;0"
    val moveFromWhere: String
    val moveToWhere: String
    val strokeNumber: String

    val result = (historyOfMoves.split("-", ";"))
    moveFromWhere = result[0]
    moveToWhere = result[1]
    strokeNumber = result[2]

    println("Откуда походили: $moveFromWhere")
    println("Куда походили: $moveToWhere")
    println("Номер хода: $strokeNumber")
}
