package com.example.odevkotlin.Odev2

fun icAciToplami(kenarSayisi: Int): Int {
    return if (kenarSayisi >= 3) {
        (kenarSayisi - 2) * 180
    } else {
        0
    }
}
fun main() {
    val aciToplami = icAciToplami(6) //
    println("İç açıların toplamı: $aciToplami")
}
