package org.example.lesson_3

fun main() {
    val numberToMultiply: Int = 7
    val multiplyByOne: Int = 1
    val multiplyByTwo: Int = 2
    val multiplyByThree: Int = 3
    val multiplyByFour: Int = 4
    val multiplyByFive: Int = 5
    val multiplyBySix: Int = 6
    val multiplyBySeven: Int = 7
    val multiplyByEight: Int = 8
    val multiplyByNine: Int = 9

    val multiplicationTable = """
        $numberToMultiply X $multiplyByOne = ${numberToMultiply * multiplyByOne}
        $numberToMultiply X $multiplyByTwo = ${numberToMultiply * multiplyByTwo}
        $numberToMultiply X $multiplyByThree = ${numberToMultiply * multiplyByThree}
        $numberToMultiply X $multiplyByFour = ${numberToMultiply * multiplyByFour}
        $numberToMultiply X $multiplyByFive = ${numberToMultiply * multiplyByFive}
        $numberToMultiply X $multiplyBySix = ${numberToMultiply * multiplyBySix}
        $numberToMultiply X $multiplyBySeven = ${numberToMultiply * multiplyBySeven}
        $numberToMultiply X $multiplyByEight = ${numberToMultiply * multiplyByEight}
        $numberToMultiply X $multiplyByNine = ${numberToMultiply * multiplyByNine}
    """.trimIndent()

    println(multiplicationTable)
}