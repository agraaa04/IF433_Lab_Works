package oop_138599_RadityaAgra.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name dengan requireNotNull [cite: 200]
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
            // Gunakan as? Int dengan fallback Elvis 12 [cite: 203]
            val warranty = (rawJson["warranty"] as? Int) ?: 12
            Electronic(id, name, warranty)
        }
            "CLOTHING" -> {
                // Gunakan as? String dengan fallback Elvis "All Size" [cite: 205]
                val size = (rawJson["size"] as? String) ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
}