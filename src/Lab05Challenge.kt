fun main() {
    print("Enter a lowercase letter: ")
    val line = readln()
    if (line.isNotEmpty()) {
        val ch = line[0]

        val shifted = if (ch in 'a'..'z') {
            'a' + (ch - 'a' + 1) % 26
        } else {
            ch
        }

        println("Shifted: $shifted")
    }
}