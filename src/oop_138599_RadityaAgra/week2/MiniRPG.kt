package oop_138599_RadityaAgra.week02
import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("1. Serang")
        println("2. Kabur")

        val choice = scanner.nextInt()

        if (choice == 1) {
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else {
            println("Hero kabur!")
            break
        }
    }

    if (hero.isAlive() && enemyHp == 0)
        println("Hero Menang!")
    else if (!hero.isAlive())
        println("Hero Kalah!")
}

