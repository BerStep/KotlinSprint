package org.example.lesson2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val deposit = 70_000
    val interestRate = 16.7
    val period = 20

    val depositBalance = deposit * (1 + interestRate / 100).pow(period)

    println("Размер вклада, черз 20 лет: %.3f".format(depositBalance))
}

