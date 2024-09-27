const val CONVERTER_MINUTES: Int = 60
const val CONVERTER_HOURS = 24

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457

    val departureTime = departureHour * CONVERTER_MINUTES + departureMinutes
    val arriveTime = departureTime + travelTime
    val arriveHour = arriveTime / CONVERTER_MINUTES % CONVERTER_HOURS
    val arriveMinutes = arriveTime % CONVERTER_MINUTES

    println("Время прибытия: ${String.format("%02d:%02d", arriveHour, arriveMinutes)}")
}
