const val WIN_NUMBER_1 = 23
const val WIN_NUMBER_2 = 36

fun main() {
    val range = 0..42
    val printInfoWinTwoNumbers = "Поздравляем! Вы выйграли главный приз!"
    val printInfoWinOneNumbers = "Вы выйграли утешительный приз!"
    val printInfoNoWin = "Неудача!"

    println("Введите два числа от 0 до 42.")
    val userNumber1 = readlnOrNull()?.toIntOrNull() ?: return
    val userNumber2 = readlnOrNull()?.toIntOrNull() ?: return
    val userNumber1Reverse = userNumber1.toString().reversed().toInt()
    val userNumber2Reverse = userNumber2.toString().reversed().toInt()

    println("Числа для победы: $WIN_NUMBER_1 и $WIN_NUMBER_2.")
    println("Учитываются ввод чисел в обтаном порядке.")

    if ((userNumber1) !in range) println("Вы ввели: $userNumber1, число вне диапозона. ")
    if (userNumber1Reverse in range) println("Число $userNumber1Reverse ,будет учитываться!")
    if (userNumber2 !in range) println("Вы ввели: $userNumber2, число вне диапозона.")
    if (userNumber2Reverse in range) println("Число $userNumber2Reverse ,будет учитываться!")
     
    val winUserNumber1 = when {
        userNumber1 == WIN_NUMBER_1 -> true
        userNumber1 == WIN_NUMBER_2 -> true
        userNumber1Reverse == WIN_NUMBER_1 -> true
        userNumber1Reverse == WIN_NUMBER_2 -> true
        else -> false
    }
    val winUserNumber2 = when {
        userNumber2 == WIN_NUMBER_1 -> true
        userNumber2 == WIN_NUMBER_2 -> true
        userNumber2Reverse == WIN_NUMBER_1 -> true
        userNumber2Reverse == WIN_NUMBER_2 -> true
        else -> false
    }

    if (winUserNumber1 && winUserNumber2) println(printInfoWinTwoNumbers)
    else if (winUserNumber1 || winUserNumber2) println(printInfoWinOneNumbers)
    else println(printInfoNoWin)
}
