package oop_138599_RadityaAgra.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}