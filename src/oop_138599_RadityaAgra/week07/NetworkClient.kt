package oop_138599_RadityaAgra.week07

class NetworkClient private constructor (val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}