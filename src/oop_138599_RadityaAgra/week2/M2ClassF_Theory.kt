package oop_138599_RadityaAgra.week2

class Pemain {
    var nama:String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    init {
        nama = "Messi"
        println("Ini adalah constructor")
    }

    constructor(alias:String="Budi", kecepatan:Int=2){
        nama = alias;
        speed = kecepatan
        println("Ini constructor kedua")
    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola")
    }
}

fun main(){
    val player = Pemain(alias = "yoel", kecepatan = 100)
    player.bawa_bola()
    println("nama pemain: ${player.nama}")
    println("skill Kecepatan: " + player.speed)

    val player2 = Pemain(alias = "Ronaldo", kecepatan = 99)
    println("Pemain populer: ${player2.nama}")
    println("Kecepatan: " + player2.speed)
}