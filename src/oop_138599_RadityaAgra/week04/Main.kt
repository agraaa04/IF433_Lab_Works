package oop_138599_RadityaAgra.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println()

    println("--- Testing Vehicle ---")
    val myCar = Car("Honda", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println()

    val tesla = ElectricCar("Tesla", 4, 90)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

}
