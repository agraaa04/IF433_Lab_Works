package oop_138599_RadityaAgra.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnon() { println("Speaker $name aktif.") }
    override fun turnoff() { println("Speaker $name nonaktif.") }
    fun playMusic(song: String) { println("Memutar lagu $song dari Spotify.") }
}