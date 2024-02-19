package org.example.lesson_2

fun main() {
    val nemberOfEmployees: Int = 50
    val namberOfTrainees: Int = 30
    val salaryEmployees: Int = 30000
    val salaryTrainees: Int = 20000

    val employeeSalaryExpenses: Int = nemberOfEmployees * salaryEmployees
    val generalExpenses: Int = (nemberOfEmployees * salaryEmployees) + (namberOfTrainees * salaryTrainees)
    val averageSalary: Int = generalExpenses / (nemberOfEmployees + namberOfTrainees)

    println("Расходы на выплату ЗП постоянным сторудникам: $employeeSalaryExpenses")
    println("Общие расходы по ЗП: $generalExpenses")
    println("Средняя зарплата одного сотрудника: $averageSalary")

}