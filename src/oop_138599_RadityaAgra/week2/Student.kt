package oop_138599_RadityaAgra.week2

import java.util.Scanner

class Student (
    val name:String,
    val nim:String,
    var major:String,
    var gpa:Double = 0.0
){
    init{
        //Validasi sederhana: Cek panjang NIM
        if (nim.length != 5){
            println("WARNING: Object tercipta dengan NIM ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        }else {
            println("LOG: Object Student $name berhasil dialokasikan di Memory")
        }
    }

    constructor(name: String, nim: String): this(name, nim, "Non-Matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- Aplikasi PMB UMN --")

    println("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter")
    }
}