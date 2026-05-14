package oop_138599_RadityaAgra.week12

fun main() {
    val result = runCatching {
        "123a".toInt()
    }

    println(result)
}