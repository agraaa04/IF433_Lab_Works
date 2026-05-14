package oop_138599_RadityaAgra.week12

class InsufficientFundsException(message: String) : Exception(message)

class BankAccount(var balance: Int) {
    fun withdraw(amount: Int) {
        if (amount > balance) {
            throw InsufficientFundsException("Saldo tidak cukup!")
        }

        balance -= amount
        println("Penarikan berhasil. Sisa saldo: $balance")
    }
}