package org.example.lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buffCrystalOre: Int = (crystalOre * buff20) / 100
    val buffIronOre: Int = (ironOre * buff20) / 100

    println("Было добыто $buffCrystalOre шт. бонусной кристаллической руды")
    println("Было добыто $buffIronOre шт. бонусной железной руды")
}

const val buff20: Int = 20