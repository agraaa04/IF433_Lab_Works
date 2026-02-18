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

    //Tax (Pajak) dihitung 10% dari gaji saat ini
    val tax: Double
        get() = salary * 0.1

}

fun main(){
    val e = Employee("Budi")

    //1. Test Validasi Salary
    e.salary = -1000 // Harusnya print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. test Encapsulation
    e.increasePerformance()
//  e.performarating = 5 // Coba uncoment, pasti Merah (error)

    //3. Test Computed Property
    println("Pajak yang harus dinayar: ${e.tax}")
}