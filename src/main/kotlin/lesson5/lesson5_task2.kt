const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2024
    println("Введите Ваш год рождения:")
    val birthYear = readlnOrNull()?.toIntOrNull() ?: return println("Не корректный ввод.")
    val currentAge = currentYear - birthYear
    if (currentAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран приложения")
}
