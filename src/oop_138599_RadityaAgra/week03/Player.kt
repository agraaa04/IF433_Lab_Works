package oop_138599_RadityaAgra.week03

class Player(val username: String) {
    private var xp:Int = 0

    val level:Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount

            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}

fun main(){
    val player = Player("Raditya")

    player.addXp(50)
    println("Level: ${player.level}")

    player.addXp(60)
    println("Level: ${player.level}")

}