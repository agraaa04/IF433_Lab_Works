package oop_138599_RadityaAgra.week03

fun main(){
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000
}

class Employee (val name:String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}