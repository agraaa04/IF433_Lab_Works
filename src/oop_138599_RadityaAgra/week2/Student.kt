package oop_138599_RadityaAgra.week2

import java.util.Scanner

class Student (val name:String,val nim:String, val major:String){
    init{
        //Validasi sederhana: Cek panjang NIM
        if (nim.length != 5){
            println("WARNING: Object tercipta dengan NIM ($nim) yang tidak tidak valid")
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
    }else {
        println("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        //Instansiasi Objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Berhasil")
    }
}