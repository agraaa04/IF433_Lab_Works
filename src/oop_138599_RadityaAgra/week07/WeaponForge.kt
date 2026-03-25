package oop_138599_RadityaAgra.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }
        fun forgeEpicSword(): Weapon {
            return Weapon(GameItem("Excalibur", 100, ItemRarity.EPIC), 200)
        }
    }
}