package oop_138599_RadityaAgra.week05

class WajibLEC: MataKuliahLEC() {
    override fun set_matkul(sks: Int){
        super.nama = "OOP"
        println("Matkul ${super.nama} sks $sks")
    }
    fun ada_seminar(){
        println("Wajib ada seminar")
    }
}