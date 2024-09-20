package org.example.lesson1

fun main() {
    val second: Int = 6480
    val minute: Int = second / 60
    val hour: Int = minute / 60
    println("0$hour:${minute % 60}:0${second % 60}")
}