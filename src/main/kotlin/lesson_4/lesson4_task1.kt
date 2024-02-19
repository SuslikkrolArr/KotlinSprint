package org.example.lesson_4

fun main() {
    val numberOfReservedTablesForToday: Int = 13
    val numberOfReservedTablesForTomorrow: Int = 9

    println("Доступность столиков на сегодня ${numberOfReservedTablesForToday < NUMBER_OF_TABLES}")
    println("Доступность столиков на сегодня ${numberOfReservedTablesForTomorrow < NUMBER_OF_TABLES}")

}

const val NUMBER_OF_TABLES: Int = 13