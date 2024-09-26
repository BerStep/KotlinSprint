fun main() {
    val sumResult = 23
    println("Чему равна сумма двух чисел 15+8?")
    val inputNumber = readlnOrNull()?.toIntOrNull()
    if (inputNumber == sumResult) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")
}
