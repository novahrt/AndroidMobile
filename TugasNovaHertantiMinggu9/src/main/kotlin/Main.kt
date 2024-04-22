import kotlinx.coroutines.*

fun main() {
    // Membuat coroutine job dengan async
    val job = GlobalScope.async {
        // Penundaan eksekusi selama 3 detik
        delay(3000L)
        // Setelah penundaan selesai, mengembalikan pesan
        "Penundaan selesai!"
    }

    // Menjalankan program utama dalam coroutine runBlocking
    runBlocking {
        // Menunggu dan mencetak hasil dari coroutine job
        val result = job.await()
        println(result)
    }
}
