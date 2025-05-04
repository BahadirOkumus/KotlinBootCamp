package com.example.odevkotlin.Odev2

fun aHarfiSayisi(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}
fun main() {
    val sayi = aHarfiSayisi("Ankara")
    println("a harfi sayısı: $sayi")
}
