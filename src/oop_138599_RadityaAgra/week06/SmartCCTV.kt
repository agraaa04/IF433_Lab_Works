package oop_138599_RadityaAgra.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnon() {
        println("CCTV $name menyala.")
        startRecord()
    }
    override fun turnoff() { println("CCTV $name mati.") }
    override fun startRecord() { println("CCTV $name mulai merekam...") }
}