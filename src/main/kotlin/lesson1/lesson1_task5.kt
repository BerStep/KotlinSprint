package org.example.lesson1

fun main() {
    val second = 6480
    val minute = second / 60
    val hour = minute / 60
    println("0$hour:${minute % 60}:0${second % 60}")

    // второй вариант
    println("")
    val allSecond = 6480
    val allMinute = allSecond / 60
    val allHour = allSecond / 60 / 60
    print(0)
    print(allHour)
    print(":")
    print(allMinute - allHour * 60)
    print(":")
    print(allSecond % 60)
    print(0)
}