package oop_138599_RadityaAgra.week07

fun main(){
    println("server: ${KoneksiLEC.linkServer}")
    KoneksiLEC.test_koneksi()

    MahasiswaLEC.nama="udin"
    val na:Int = MahasiswaLEC.set_nilai(80, 100)
    println("Nilai ${MahasiswaLEC.nama} adalah $na")

    MahasiswaLEC.isi_nama_kampus("UMN")

    val dsn1 = DosenLEC("Indah", "12345", 2020)
    println(dsn1)
    val dsn2 = dsn1.copy("Budi", "32154")
    println(dsn2)
    //cara ambil data 1 field aja
    println("Nama dosen 1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")

    // ---- Call ENUM Class ----
    println("Matkul Favorit saya ${MataKuliahLEC.OOP.name}")
    println(MataKuliahLEC.OOP)
    MataKuliahLEC.OOP.sks_matkul()

    // ---- looping munculin semua
    for(matkul in MataKuliahLEC.entries){
        print("matkul: "+ matkul + " ")
        matkul.sks_matkul()
    }
}