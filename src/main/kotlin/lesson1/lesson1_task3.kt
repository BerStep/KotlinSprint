package org.example.lesson1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7
    println(year)
    println(hour)
    println(minute)
    hour = 10
    minute = 55
// первый вариант
    println("$hour:$minute")
// второй вариант
    print(hour)
    print(":")
    print(minute)
}