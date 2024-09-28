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
    val userNumberOneReverse = userNumberOne.toString().reversed().toInt()
    val userNumberTwoReverse = userNumberTwo.toString().reversed().toInt()

    println("Числа для победы: $WIN_NUMBER_ONE и $WIN_NUMBER_TWO.")
    println("Учитываются ввод чисел в обтаном порядке.")

    if ((userNumberOne) !in range) println("Вы ввели: $userNumberOne, число вне диапозона. ")
    if (userNumberOneReverse in range) println("Число $userNumberOneReverse ,будет учитываться!")
    if (userNumberTwo !in range) println("Вы ввели: $userNumberTwo, число вне диапозона.")
    if (userNumberTwoReverse in range) println("Число $userNumberTwoReverse ,будет учитываться!")
     
    val isWinUserNumber1 = when {
        userNumberOne == WIN_NUMBER_ONE -> true
        userNumberOne == WIN_NUMBER_TWO -> true
        userNumberOneReverse == WIN_NUMBER_ONE -> true
        userNumberOneReverse == WIN_NUMBER_TWO -> true
        else -> false
    }
    val isWinUserNumber2 = when {
        userNumberTwo == WIN_NUMBER_ONE -> true
        userNumberTwo == WIN_NUMBER_TWO -> true
        userNumberTwoReverse == WIN_NUMBER_ONE -> true
        userNumberTwoReverse == WIN_NUMBER_TWO -> true
        else -> false
    }

    if (isWinUserNumber1 && isWinUserNumber2) println(printInfoWinTwoNumbers)
    else if (isWinUserNumber1 || isWinUserNumber2) println(printInfoWinOneNumbers)
    else println(printInfoNoWin)
}
