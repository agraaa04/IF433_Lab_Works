package oop_138599_RadityaAgra.week07

enum class MataKuliahLEC(val jmlSks:Int) {
    OOP(3),
    GAMEDEV(4),
    DASPRO(2);

    fun sks_matkul(){
        println("Jml sksnya: $jmlSks")
    }
}