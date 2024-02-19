package org.example.lesson_3

import javax.swing.Spring

fun main() {
    val firstName: String = "Татьяна"
    var  lastName: String = "Андреева"
    val fatherName: String = "Сергеевна"
    var age: Int = 20

    println("$lastName $firstName $fatherName, $age")

    lastName = "Сидорова"
    age = 22

    println("$lastName $firstName $fatherName, $age")

}