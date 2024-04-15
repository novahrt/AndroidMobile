class Mobil(val merek: String, val model: String, val tahunProduksi: Int) {
    fun startEngine() {
        println("Mesin dihidupkan")
    }

    fun stopEngine() {
        println("Mesin dimatikan")
    }
}

fun main() {
    val mobil = Mobil("Audi", "Audi A6", 2000)
    mobil.startEngine()
    mobil.stopEngine()
}