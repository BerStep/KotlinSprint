const val DAMAGE_SHIP = false
const val CREW_OF_SHIP_MIN = 55
const val CREW_OF_SHIP_MAX = 70
const val PROVISIONS_SHIP = 50
const val FAVORABLE_WEATHER = true

fun main() {
    println("Есть ли повреждения коробля?")
    val damageOfShip = readlnOrNull().toBoolean()
    println("Введите колличество экипажа:")
    val crewOfShip = readlnOrNull()?.toInt()
    println("Введите колличество ящиков с провизией:")
    val provisionsShip = readlnOrNull()?.toInt()
    println("Благоприятная сейчас погода?:")
    val favorableWeather = readlnOrNull().toBoolean()

    val shipReadiness: Boolean =
        ((damageOfShip == DAMAGE_SHIP) && (crewOfShip in CREW_OF_SHIP_MIN..CREW_OF_SHIP_MAX) &&
                (provisionsShip!! > PROVISIONS_SHIP) && (favorableWeather == FAVORABLE_WEATHER)) ||
                ((crewOfShip == CREW_OF_SHIP_MAX) && (favorableWeather == FAVORABLE_WEATHER) &&
                        (provisionsShip!! > PROVISIONS_SHIP))

    println("Готов ли корабль отправится в плавание?: $shipReadiness")
}
