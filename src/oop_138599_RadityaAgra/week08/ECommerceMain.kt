package oop_138599_RadityaAgra.week08

fun main() {
    // Data kotor JSON dari PDF
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("=== PROCESSING E-COMMERCE BATCH ===")
    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            // Gunakan ?.let untuk memanggil checkout jika tidak null
            product?.let {
                println("Processing ${it.javaClass.simpleName}: ${raw["name"]}")
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            // Tangkap data korup (seperti Ghost Item)
            println("LOG: Skipping corrupt data - ${e.message}")
        }
    }
}