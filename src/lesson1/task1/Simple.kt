@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.*

/**
 * Пример
 *
 * Вычисление квадрата целого числа
 */
fun sqr(x: Int): Int {
    return x
}

/**
 * Пример
 *
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double): Double {
    return x * x
}

/**
 * Пример
 *
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
 * Пример
 *
 * Поиск одного из корней квадратного уравнения
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Пример
 *
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

/**
 * Пример главной функции
 */
fun main() {
    var retult0 = seconds(8, 20, 35)
    println("seconds = $retult0")

    val result1 = lengthInMeters(8, 2, 11)
    println("lengthInMeters = $result1")

    val result3 = trackLength(3.0,0.0,0.0,4.0)
    println("trackLength = $result3")

    val result4 = thirdDigit(3801)
    println("thirdDigit = $result4")

    val result5 = travelMinutes(9, 25, 13, 1)
    println("travelMinutes = $result5")

    val result6 = accountInThreeYears(100, 10)
    println("accountInThreeYears = $result6")

    val result7 = numberRevert(478)
    println("numberRevert = $result7")



}

/**
 * Тривиальная
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    var h = hours * 3600
    var m = minutes * 60
    var s = h + m + seconds
    return s
}

/**
 * Тривиальная
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double {
    var s = sagenes * 48
    var a = arshins * 16
    var v = ((s + a + vershoks) * 4.445 )/100
    return v.toDouble()
}

/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double = TODO()

/**
 * Тривиальная
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    var x = x2-x1
    var y = y2-y1
    var result = sqrt(sqr(x)+sqr(y))
    return result
}

/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
fun thirdDigit(number: Int): Int {
    return (number / 100) % 10
}

/**
 * Простая
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val h1 = hoursDepart * 60
    val m1 = h1 + minutesDepart
    val h2 = hoursArrive * 60
    val m2 = h2 + minutesArrive
    return m2 - m1
}

/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double {
    val result =
        initial * ((1 + (percent.toDouble() / 100)) * (1 + (percent.toDouble() / 100)) * (1 + (percent.toDouble() / 100)))
    return result
}

/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int {
    var result: String = ""
    var num = number
    var res = 0
    for(i in 1..3){
        res = num % 10
        num /= 10
        result += res
    }
    return result.toInt()

}
