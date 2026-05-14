package oop_138599_RadityaAgra.week12

fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        -1
    } finally {
        println("Division attempt finished")
    }
}

fun main() {
    println("=== TEST BASIC EXCEPTION ===")
    val result = divide(10, 0)
    println("Hasil: $result")
}