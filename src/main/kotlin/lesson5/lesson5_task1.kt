fun main() {
    val verificationName1 = 15
    val verificationName2 = 8
    val sumResult = verificationName1 + verificationName2

    println("Чему равна сумма двух чисел $verificationName1+$verificationName2?")

    val inputNumber = readlnOrNull()?.toIntOrNull()
    
    if (inputNumber == sumResult) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")
}
