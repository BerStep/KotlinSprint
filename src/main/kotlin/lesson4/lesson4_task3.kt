const val CRITERIA_SUNNY_WEATHER = true
const val CRITERIA_OPEN_TENT = true
const val CRITERIA_AIR_HUMIDITY = 20
const val CRITERIA_SEASON = "зима"

fun main() {
    val sunnyWeather: Boolean = true
    val openTent: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val favorableConditions = (sunnyWeather == CRITERIA_SUNNY_WEATHER) && (openTent == CRITERIA_OPEN_TENT)
            && (airHumidity == CRITERIA_AIR_HUMIDITY) && (season != CRITERIA_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых?: $favorableConditions")
}
