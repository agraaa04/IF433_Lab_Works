package oop_138599_RadityaAgra.week08

sealed class Product [cite: 192]

data class Electronic(
    val id: String,
    val name: String,
    val warrantyMonths: Int
) : Product() [cite: 193]

data class Clothing(
    val id: String,
    val name: String,
    val size: String
) : Product() [cite: 194]