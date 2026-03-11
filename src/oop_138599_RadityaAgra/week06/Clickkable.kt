package oop_138599_RadityaAgra.week06

interface Clickable {
    val name: String = "Tombol Rahasia" // ERROR: Property in an interface cannot have a backing field
    fun click()
}