package oop_138599_RadityaAgra.week07

object GameManager {
    var isGameRunning: Boolean = false
    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}