package com.example.odevkotlin.Odev2

fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}
fun main() {
    val cevre = dikdortgenCevresi(5, 10)
    println("Dikdörtgenin çevresi: $cevre")
}


