package org.example.lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val percentageOFCrystalOreNoBuff: Int = 100
    val percentageIronOreNoBuff: Int = 100

    val buffCrystalOre: Int = (crystalOre * buff20) / percentageOFCrystalOreNoBuff
    val buffIronOre: Int = (ironOre * buff20) / percentageIronOreNoBuff

    println("Было добыто $buffCrystalOre шт. бонусной кристаллической руды")
    println("Было добыто $buffIronOre шт. бонусной железной руды")
}

const val buff20: Int = 20