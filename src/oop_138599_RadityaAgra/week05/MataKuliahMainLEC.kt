package oop_138599_RadityaAgra.week05

fun main(){
    val listMatkul:List<MataKuliahLEC> = listOf(
        WajibLEC(),
        ElectiveLEC()
    )

    println("banyak tipe matkul: $listMatkul")

    //panggil method anak2 -> si set_matkul()
    for(mku in listMatkul){
        mku.set_matkul(3)

        //cara1 manggil method berbeda untuk all anak class
        if(mku is WajibLEC) {
            mku.ada_seminar()
        }else if(mku is ElectiveLEC) {
            mku.ada_praktek()
        }

        //cara2 manggil method berbeda untuk all anak class
        when(mku){
            is WajibLEC ->{
                println("Wajb dari When: ")
                mku.ada_seminar()
            }
            is ElectiveLEC ->{
                println("Elective dari When: ")
                mku.ada_praktek()
            }
        }
    }



//    val wjb = WajibLEC()
//    wjb.set_matkul(3)
//
//    val elc = ElectiveLEC()
//    elc.set_matkul(2)
}