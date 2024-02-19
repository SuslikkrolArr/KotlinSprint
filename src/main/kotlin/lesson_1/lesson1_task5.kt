package org.example.lesson_1

fun main() {
    val seconds = 6480
    val hours = seconds / secondsInAnHour
    val minutes = (seconds % secondsInAnHour) / minutesInAnHour
    val remaiderOfSeconds =  seconds - ((hours * secondsInAnHour) + (minutes * minutesInAnHour))

    println("0$hours:$minutes:0$remaiderOfSeconds")

}
const val secondsInAnHour: Int = 3600
const val minutesInAnHour: Int = 60