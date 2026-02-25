package oop_138599_RadityaAgra.week04

open class Car(brand:String, val numberOfDoors:Int) : Vehicle(brand) {

    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors")
    }

    override fun honk() {
        println("$brand berbunyi: Beep beep!")
    }

}