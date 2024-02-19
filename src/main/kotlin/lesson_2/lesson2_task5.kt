package org.example.lesson_2

import java.lang.Math.floor
import kotlin.math.pow

fun main() {
    val amountInBank = 70000
    val interestRate = 16.7
    val depositYears = 20

    val finalDepositAmount = amountInBank * (1 + interestRate / 100).pow(depositYears)

    println(floor(finalDepositAmount * 1000.0) / 1000.0)

}