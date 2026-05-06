package oop_138599_RadityaAgra.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// Extension function pada tipe nullable
fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}