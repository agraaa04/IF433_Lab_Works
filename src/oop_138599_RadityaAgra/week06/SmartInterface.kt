package oop_138599_RadityaAgra.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnon()
    fun turnoff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}