const val IS_DAMAGE_SHIP: Boolean = false
const val CREW_OF_SHIP_MIN: Int = 55
const val CREW_OF_SHIP_MAX: Int = 70
const val PROVISIONS_SHIP: Int = 50
const val IS_FAVORABLE_WEATHER: Boolean = true

fun main() {
    println("Есть ли повреждения коробля? (true/false)")
    val isDamageOfShip = readlnOrNull().toBoolean()
    println("Вы ввели: $isDamageOfShip")
    println("Введите колличество экипажа:")
    val crewOfShip = readlnOrNull()?.toIntOrNull()   ?: return println("Не корректные данные")
    println("Вы ввели: $crewOfShip")
    println("Введите колличество ящиков с провизией:")
    val provisionsShip = readlnOrNull()?.toIntOrNull()   ?: return println("Не корректные данные")
    println("Вы ввели: $provisionsShip")
    println("Благоприятная сейчас погода? (true/false)")
    val isFavorableWeather = readlnOrNull().toBoolean()
    println("Вы ввели: $isFavorableWeather")

    val shipReadiness: Boolean =
        ((isDamageOfShip == IS_DAMAGE_SHIP) && (crewOfShip in CREW_OF_SHIP_MIN..CREW_OF_SHIP_MAX) &&
                (provisionsShip > PROVISIONS_SHIP) && (isFavorableWeather == IS_FAVORABLE_WEATHER)) ||
                ((crewOfShip == CREW_OF_SHIP_MAX) && (isFavorableWeather == IS_FAVORABLE_WEATHER) &&
                        (provisionsShip > PROVISIONS_SHIP))

    println("Готов ли корабль отправится в плавание?: $shipReadiness")
}
