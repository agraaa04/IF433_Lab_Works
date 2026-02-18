package oop_138599_RadityaAgra.week03

open class Bapake {
    private var nama: String? = "Belum Tau"
    private var umur: Int = 35
    protected var gaji:Int = 1000

    public var uangjajan:Int = 0
        set(value) {
            if(value < 0){
                println("Masa uang jajan 0 atau minus")
            }else{
                field = value
            }
        }get(){
            return field + 123
        }

    public fun set_nama(namabaru: String) {
        if (namabaru.length <= 0) {
            println("Nama tidak boleh kosong")
        } else {
            this.nama = namabaru
        }
    }

    public fun get_nama(): String? {
        return this.nama
    }

    public fun set_umur(umurbaru: Int) {
        if(umurbaru < 0){
            println("Umur tidak boleh minus")
        }else{
            this.umur = umurbaru
        }
    }

    public fun get_umur(): Int {
        return this.umur
    }
}

class Anake: Bapake(){
    fun dapatin_gaji_bapak():Int {
        gaji = 5500
        return gaji + 100
    }
}

fun main() {
    var bpk = Bapake()
    bpk.set_nama("Yanto")
    bpk.set_umur(-5)

    println("Nama Ayah Adalah ${bpk.get_nama()}")
    println("Umurnya : ${bpk.get_umur()}")

    var anak = Anake()
    anak.set_nama("Udin")

    println("Nama Papi Kamu: ${anak.get_nama()}")
    println("Gaji Bapak: ${anak.dapatin_gaji_bapak()}")

    anak.uangjajan = -100
}