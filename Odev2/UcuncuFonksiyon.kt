package com.example.odevkotlin.Odev2

fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}


fun main() {
    val sonuc = faktoriyel(5)
    println("Faktöriyel: $sonuc")
}
