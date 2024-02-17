package org.example.lesson_2

fun main() {
    val trainDepartureHours: Int = 9
    val trainDepartureMinutes: Int = 39
    val travelTimeInMinutes: Int = 457

    println("Поезд прибудет в ${travelTimeInMinutes / 60}:${travelTimeInMinutes % 60}")
}