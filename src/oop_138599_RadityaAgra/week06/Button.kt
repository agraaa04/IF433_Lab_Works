package oop_138599_RadityaAgra.week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}