package org.example.lesson_2

fun main() {
    val studentScores1: Float = 3.0f
    val studentScores2: Float = 4.0f
    val studentScores3: Float = 3.0f
    val studentScores4: Float = 5.0f
    val numberOfStudent: Byte = 4
    val classAverage = (studentScores1 + studentScores2 + studentScores3 + studentScores4) / numberOfStudent

    println(classAverage)
}