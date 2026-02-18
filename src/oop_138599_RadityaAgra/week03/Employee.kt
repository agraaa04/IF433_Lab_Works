package oop_138599_RadityaAgra.week03

class Employee (val name:String) {
    var salary: Int = 0
        set(value) {
            if (value < 0){
                println("Error: Gaji tidak boleh negatif! DI-set ke 0.")
                field = 0
            }else {
                field = value
            }
        }
    private var performanceRating: Int = 3

    fun increasePerformance() {
       performanceRating++
        println("Kinerja $name meningkat! rating: $performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1

}

fun main(){
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dinayar: ${e.tax}")
}