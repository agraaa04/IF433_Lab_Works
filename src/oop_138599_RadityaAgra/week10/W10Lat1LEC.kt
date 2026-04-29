package oop_138599_RadityaAgra.week10

//code Non-Generic
class rumah(val alamat:Any)

//code Generic
class kampus<T>(val alamat:T)

//code Generic - Multi parameter
class Komputer<T, V>(val merk:T, val barcode:V)

//code Generic - Function
fun <T: Int> Password(isiPass:T):Int{
    return isiPass.toInt() + 777
}

//code Generic - Function ada Constraint
class kalkulator<T:Number>(val a:T, val b:T){
    fun tambah(): Int {
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double{
        return a.toDouble() - b.toDouble()
    }

}

//code Generic - WHERE
val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
fun <T> penilaian(list:List<T>, kkm:T):List<T> where T: Comparable<T>{
    return list.filter {it >= kkm}
}

fun main(){
    println("===== GENERIC - WHERE =====")
    val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
    println("Daftar nilai : ${daftarNilai}")
    val nilaiAtasKKM = penilaian(daftarNilai, 70)
    println("Nilai diatas KKM : ${nilaiAtasKKM}")

    println("===== GENERIC - Constraint =====")
    val kalk = kalkulator(10.52,20.347)
    println("Penambahan: ${kalk.a} ditambah ${kalk.b} : " + kalk.tambah())
    println("Pengurangan: ${kalk.a} dikurang ${kalk.b} : " + kalk.kurang())

    println("===== GENERIC - FUNCTION =====")
    println("Password kamu: " + Password(12345))

    println("===== SAMPLE GENERIC - MULTI PARAMETER =====")
    val komp = Komputer("Dell", "A12345")
    println("Merk Komputer = " + komp.merk)
    println("Barcode komputer : ${komp.barcode}")

    println("===== SAMPLE NON-GENERIC =====")
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("===== SAMPLE GENERIC =====")
    val kmps = kampus(alamat = 300)
    val angkaKampus = kmps.alamat as Int
    println(angkaKampus + 50)
}