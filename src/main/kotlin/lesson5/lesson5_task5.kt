package org.example.lesson5

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val range = 0..42
    val randomListWinNumber = List(3) { Random.nextInt(range) }
    val userNumberList = mutableListOf<Int>()
    val printInfoRange = "Вы ввели число вне диапозона, данное число участвовать в лотырее не буедет."

    println("Введите три числа от 0 до 42.")

    val userNumberOne = readln().toInt()
    if (userNumberOne in range) userNumberList.add(userNumberOne)
    else println(printInfoRange)
    val userNumberTwo = readln().toInt()
    if (userNumberTwo in range) userNumberList.add(userNumberTwo)
    else println(printInfoRange)
    val userNumberThree = readln().toInt()
    if (userNumberThree in range) userNumberList.add(userNumberThree)
    else println(printInfoRange)
    val comparisonOfResult = randomListWinNumber.intersect(userNumberList)

    val printInfoWinThreeNumbers = "Поздравляем! Вы выйграли главный джекпот угадав ${comparisonOfResult.size} числа!"
    val printInfoWinTwoNumbers = "Поздравляем! Вы выйграли крупный приз, угадав ${comparisonOfResult.size} числа!"
    val printInfoWinOneNumbers = "Вы выйграли утешительный приз, угадав ${comparisonOfResult.size} число!"
    val printInfoNoWin = "Неудача, Вы не угадали ни одного числа!"

    when (comparisonOfResult.size) {
        3 -> println(printInfoWinThreeNumbers)
        2 -> println(printInfoWinTwoNumbers)
        1 -> println(printInfoWinOneNumbers)
        else -> println(printInfoNoWin)
    }

    println("Выигрышные числа: $randomListWinNumber, Вы вввели: $userNumberList.")
}
