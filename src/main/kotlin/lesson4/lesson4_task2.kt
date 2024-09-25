const val MINIMUM_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 120

fun main() {
    val packageWeight1 = 20
    val packageVolume1 = 80
    val packageWeight2 = 50
    val packageVolume2 = 100

    println("Груз с весом $packageWeight1 кг и объемом $packageVolume1 л соответствует категории 'Average':" +
            " ${(packageWeight1 in (MINIMUM_WEIGHT + 1)..MAX_WEIGHT && packageVolume1 < MAX_VOLUME)}")
    println("Груз с весом $packageWeight2 кг и объемом $packageVolume2 л соответствует категории 'Average':" +
            " ${(packageWeight2 in (MINIMUM_WEIGHT + 1)..MAX_WEIGHT && packageVolume2 < MAX_VOLUME)}")
}
