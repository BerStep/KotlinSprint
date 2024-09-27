const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val CRITERIA_AIR_HUMIDITY = 20
const val CRITERIA_SEASON = "зима"

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val isFavorableConditions =
        (isSunny == IS_SUNNY) && (isAwningOpen == IS_AWNING_OPEN) &&
                (airHumidity == CRITERIA_AIR_HUMIDITY) && (season != CRITERIA_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых?: $isFavorableConditions")
}
