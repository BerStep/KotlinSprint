package org.example.lesson2

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457
    val converterMinutes = 60
    val converterHour = 24

    val departureTime = departureHour * converterMinutes + departureMinutes
    val arriveTime = departureTime + travelTime
    val arriveHour = arriveTime / converterMinutes % converterHour
    val arriveMinutes = arriveTime % converterMinutes

    println("Время прибытия: ${String.format("%02d:%02d", arriveHour, arriveMinutes)}")
}

