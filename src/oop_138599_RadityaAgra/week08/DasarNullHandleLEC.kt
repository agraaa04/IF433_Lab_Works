package oop_138599_RadityaAgra.week08

class set_krs(val nim:String?, val kodematkul:String){
    fun matkul_wajib(sks:Int){
        println("Matkul kamu adalah $kodematkul sks-nya adalah $sks")
    }
}

fun main(){
    var nama:String?
    nama = null
    println("Hai $nama")

    val settingKRS = set_krs("133", "null")
    println("Nim kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(3)
}