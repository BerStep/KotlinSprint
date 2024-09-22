package org.example.lesson1

fun main() {
    val converterMinute: Int = 60
    val converterHour: Int = 24
    var second: Int = 6480

    var minute: Int = second / converterMinute
    var hour: Int = minute / converterMinute
    second %= converterMinute
    minute %= converterMinute
    hour %= converterHour
    val time = String.format("%02d:%d:%02d", hour, minute, second)

    println("Время проведенное в космосе: $time")
}