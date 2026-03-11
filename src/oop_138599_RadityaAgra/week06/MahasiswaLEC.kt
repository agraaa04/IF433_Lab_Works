package oop_138599_RadityaAgra.week06

class MahasiswaLEC(
    override val namaOrg:String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMK: String,
    override val nilaiMK: Int,
    ): OrganisasiLEC, KelasMKLEC {
    override fun rapat(){
        println("Sedang rapat di $namaOrg")
        println("Biaya Konsum rapat: ${super.biayaKonsumsi}")
    }

    override fun penilaian(){
        println("Nilai $namaMK adalah $nilaiMK")
    }

    override fun keaktifan(){
        super<KelasMKLEC>.keaktifan();
        super<OrganisasiLEC>.keaktifan();
    }
}