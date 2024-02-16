package org.example.lesson_1

fun main() {
    val seconds = 6480
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val remaiderOfSeconds =  seconds - ((hours * 3600) + (minutes * 60))

    println("0$hours:$minutes:0$remaiderOfSeconds")


}