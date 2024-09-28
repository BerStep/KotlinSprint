const val WIN_NUMBER_ONE = 23
const val WIN_NUMBER_TWO = 36

fun main() {
    val range = 0..42
    val printInfoWinTwoNumbers = "Поздравляем! Вы выйграли главный приз!"
    val printInfoWinOneNumbers = "Вы выйграли утешительный приз!"
    val printInfoNoWin = "Неудача!"

    println("Введите два числа от 0 до 42.")
    val userNumberOne = readlnOrNull()?.toIntOrNull() ?: return
    val userNumberTwo = readlnOrNull()?.toIntOrNull() ?: return

    println("Числа для победы: $WIN_NUMBER_ONE и $WIN_NUMBER_TWO.")

    if ((userNumberOne) !in range) println("Вы ввели: $userNumberOne, число вне диапозона. ")
    if (userNumberTwo !in range) println("Вы ввели: $userNumberTwo, число вне диапозона.")
     
    val isWinUserNumber1 = when (userNumberOne) {
        WIN_NUMBER_ONE -> true
        WIN_NUMBER_TWO -> true
        else -> false
    }
    val isWinUserNumber2 = when (userNumberTwo) {
        WIN_NUMBER_ONE -> true
        WIN_NUMBER_TWO -> true
        else -> false
    }

    if (isWinUserNumber1 && isWinUserNumber2) println(printInfoWinTwoNumbers)
    else if (isWinUserNumber1 || isWinUserNumber2) println(printInfoWinOneNumbers)
    else println(printInfoNoWin)
}
