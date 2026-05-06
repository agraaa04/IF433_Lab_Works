package oop_138599_RadityaAgra.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    // apply mengembalikan objek itu sendiri, menggunakan 'this'[cite: 3]
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)
}