package oop_138599_RadityaAgra.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3)
            (loanDuration - 3) * 2000
        else 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    val inputDuration = scanner.nextInt()

    val duration = if (inputDuration < 0) 1 else inputDuration

    val loan = Loan(title, borrower, duration)

    println("Total denda: Rp ${loan.calculateFine()}")

}
