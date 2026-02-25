package oop_138599_RadityaAgra.week4

class Sushi:Makanan() {
    var jenis:String = ""
    public fun sushi_terjual(jns:String, jml:Int){
        this.jenis = jns
        super.harga = jml * 100
        println("Sushi $jenis laku $harga")
    }
}