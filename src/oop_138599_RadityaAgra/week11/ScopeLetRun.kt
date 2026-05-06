package oop_138599_RadityaAgra.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // let menggunakan 'it' dan ideal untuk null safety
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")
}