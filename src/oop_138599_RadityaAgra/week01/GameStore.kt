package oop_138599_RadityaAgra.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750_000

    val discount = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }
