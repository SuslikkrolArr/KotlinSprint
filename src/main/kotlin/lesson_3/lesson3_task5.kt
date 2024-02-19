package org.example.lesson_3

fun main() {
    val playersMove:String = "D2-D4;0"
    var startOfTheMove: String = playersMove.substring(0, 2)
    var endOfStroke: String = playersMove.substring(3, 5)
    var moveNumber: String = playersMove.substring(6)

    println(startOfTheMove)
    println(endOfStroke)
    println(moveNumber)
}