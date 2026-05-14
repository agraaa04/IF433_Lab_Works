package oop_138599_RadityaAgra.week12

fun main() {
    val result = runCatching {
        "123a".toInt()
    }

    val value = result.getOrElse {
        -1
    }

    println(value)

    val recovered = result.recover {
        0
    }

    println(recovered.getOrNull())
}