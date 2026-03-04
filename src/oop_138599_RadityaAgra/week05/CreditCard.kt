package oop_138599_RadityaAgra.week05

class CreditCard(accountName: String, val limit: Double)
    : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil dengan Credit Card. Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu.")
        }
    }
}