package oop_138599_RadityaAgra.week08

class Alamat(val nomor:Int, val kota:String)
class Mahasiswa(val nim:String, val addr:Alamat)

fun main(){
    val almt = Alamat(47, "Tangerang")
    val mhs = Mahasiswa("12345", almt)

    val defaultAlamat = mhs.addr?.let {
        alamatAsli -> "Sini Nih... ${mhs.addr.kota} Nomornya ${mhs.addr.nomor}"
    }?:"Gakjelas, gatau dimana"

    println("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}")
}