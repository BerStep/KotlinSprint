const val TABLE_IN_RESTAURANT = 13

fun main() {
    val reservedTableToday = 13
    val reservedTableTomorrow = TABLE_IN_RESTAURANT - 4
    val freeTableToday = TABLE_IN_RESTAURANT - reservedTableToday > 0
    val freeTableTomorrow = TABLE_IN_RESTAURANT - reservedTableTomorrow > 0

    println("Доступность столиков на сегодня: $freeTableToday\nДоступность столиков на завтра: $freeTableTomorrow")
}
