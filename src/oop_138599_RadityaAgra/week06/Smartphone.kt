package oop_138599_RadityaAgra.week06

// ERROR: Class Smartphone inherits multiple implementations of turnon()

class Smartphone: Camera, Phone {
    override fun turnon() {
        super<Camera>.turnon()
        super<Phone>.turnon()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}