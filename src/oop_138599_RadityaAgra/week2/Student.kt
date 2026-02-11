package oop_138599_RadityaAgra.week2

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
}