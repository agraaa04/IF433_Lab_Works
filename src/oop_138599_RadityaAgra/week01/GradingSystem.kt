package oop_138599_RadityaWeek01.week01

fun main() {
    //REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name: String = "John Thor"
    val score: Int = 80

    // REFACTOR: String Template ($name)
    println("Name : $name, Score : $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    //Tambahkan di akhir main()
    val studentId: String? = null

    //Jika null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"