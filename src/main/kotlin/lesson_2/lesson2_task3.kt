package org.example.lesson_2

fun main() {
    val trainDepartureHours: Int = 9
    val trainDepartureMinutes: Int = 39
    val trainDepartureTimeAllMinutes: Int = trainDepartureHours * sixtyMinutes + trainDepartureMinutes
    val travelTimeInMinutes: Int = 457
    val sumDepartureAndTravelMinutes: Int = trainDepartureTimeAllMinutes + travelTimeInMinutes


    println("Поезд прибудет в ${sumDepartureAndTravelMinutes / sixtyMinutes}:${sumDepartureAndTravelMinutes % sixtyMinutes}")
}
const val sixtyMinutes: Int = 60