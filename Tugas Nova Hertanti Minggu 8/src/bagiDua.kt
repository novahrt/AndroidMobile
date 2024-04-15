fun bagiDua(pembilang: Int, penyebut: Int) {
    try {
        val hasil = pembilang / penyebut
        println("Hasil pembagian: $hasil")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan: ${e.message}")
    }
}

fun main() {
    // Contoh pemanggilan fungsi bagiDua
    val pembilang = 20
    val penyebut = 0 // Ubah nilai penyebut agar tidak nol

    println("Mencoba membagi $pembilang dengan $penyebut")
    bagiDua(pembilang, penyebut)
}
