package oop_138599_RadityaAgra.week03

class Weapon(val name:String, damage: Int){
    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif!")
            } else if (value > 1000) {
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}