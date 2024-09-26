fun main() {
    val trainingDay = 5
    val isSomeSituation = trainingDay % 2 == 0

    println(
        """
            Упражнения для рук: ${!isSomeSituation}
            Упражнения для ног: $isSomeSituation
            Упражнения для спины: $isSomeSituation
            Упражнения для пресса: ${!isSomeSituation}
    """.trimIndent()
    )
}
