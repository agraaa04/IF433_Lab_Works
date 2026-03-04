package oop_138599_RadityaAgra.week05

class ElectiveLEC:MataKuliahLEC() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Elektif ${super.nama} sks $sks")
    }
    fun ada_praktek(){
        println("Wajib di praktekin")
    }
}