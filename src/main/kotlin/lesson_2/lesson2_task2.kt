package org.example.lesson_2

fun main() {
    val nemberOfEmployees: Int = 50
    val namberOfTrainees: Int = 30

    val employeeSalaryExpenses: Int = nemberOfEmployees * 30000
    val generalExpenses: Int = (nemberOfEmployees * 30000) + (namberOfTrainees * 20000)
    val averageSalary: Int = generalExpenses / (nemberOfEmployees + namberOfTrainees)

    println("Расходы на выплату ЗП постоянным сторудникам: $employeeSalaryExpenses")
    println("Общие расходы по ЗП: $generalExpenses")
    println("Средняя зарплата одного сотрудника: $averageSalary")


}