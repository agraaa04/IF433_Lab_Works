package oop_138599_RadityaAgra.week07

class MahasiswaLEC private constructor(val kampus:String) {
    companion object {
        var nama:String = "unknown"

        fun set_nilai(uts:Int, uas:Int):Int{
            return (uts+uas)/2
        }

        fun isi_nama_kampus(namaUniv: String){
            MahasiswaLEC(namaUniv)
        }
    }

    //bagian class biasa bukan companion

    init{
        println("nama kampus kamu $kampus")
    }
}