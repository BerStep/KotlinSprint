package org.example.lesson1

fun main() {
    val converter = 60
    var second: Int = 6480
    var minute: Int = second / converter
    var hour: Int = minute / converter
    second %= converter
    minute %= converter
    hour %= 24
    val time = String.format("0%d:%d:0%d", hour, minute, second)
    println(time)
}