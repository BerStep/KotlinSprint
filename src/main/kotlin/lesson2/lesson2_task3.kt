package org.example.lesson2

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457
    val departureTime = departureHour * 60 + departureMinutes
    val arriveTime = departureTime + travelTime
    println("Время прибытия: ${arriveTime / 60}:${arriveTime % 60}")
}

