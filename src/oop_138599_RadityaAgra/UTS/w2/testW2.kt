package oop_138599_RadityaAgra.UTS.w2

import java.util.Scanner

class DataKostBuHartini(
    var nama: String = "",
    var Umur: Int = 0,
    var Kerja: String = "",
    var durasi: Int = 0){

    init{
        if(durasi == 1){
            println("Nama: $nama")
            println("Umur: $Umur")
            println("Kerja: $Kerja")
            println("Durasi: $durasi Bulan")
        }else if(durasi == 2){
            println("Nama: $nama")
            println("Umur: $Umur")
            println("Kerja: $Kerja")
            println("Durasi: $durasi Bulan")
        }else{
            println("Durasi Nginap Gabisa 0")
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("=== Aplikasi Pendataan Kost Hartini ===")

    println("Masukkan nama: ")
    val name = scanner.next()

    println("Masukkan Umur: ")
    val umur = scanner.nextInt()

    println("Masukkan Kerja: ")
    val kerja = scanner.next()

    println("Masukkan Durasi: ")
    val durasi = scanner.nextInt()

    val kost = DataKostBuHartini(name, umur, kerja, durasi)
}