package oop_138599_RadityaAgra.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Ada ${event.monsterName} muncul!")
        is BattleState.LootDropped -> {
            val (name, _, rarity) = event.item
            println("Anda mendapatkan loot: $name [Rarity: $rarity]")
        }
        is BattleState.GameOver -> println("Permainan Berakhir: ${event.reason}")
        BattleState.SafeZone -> println("Anda berada di zona aman.")
    }
}