package oop_138599_RadityaAgra.week06

interface OrganisasiLEC {
    val namaOrg:String;
    val budgetRapat:Int;
    val jmlOrg: Int
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg

    fun rapat()
    fun keaktifan(){
        println("ih kamu aktif")
    }
}