fun main() {
    val trainingDay = 5
    val kindTraining = trainingDay % 2
    val handsAndPress = kindTraining == 1
    val footAndBack = kindTraining == 0

    println(
        """
            Упражнения для рук: $handsAndPress
            Упражнения для ног: $footAndBack
            Упражнения для спины: $footAndBack            
            Упражнения для пресса: $handsAndPress         
    """.trimIndent()
    )
}
