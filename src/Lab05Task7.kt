fun main() {
    print("Enter a character: ")
    val line = readln()
    if (line.isNotEmpty()) {
        val ch = line[0]

        println("isDigit: ${ch.isDigit()}")
        println("isLetter: ${ch.isLetter()}")
        println("isWhitespace: ${ch.isWhitespace()}")
        println("lowercase: ${ch.lowercaseChar()}")
        println("uppercase: ${ch.uppercaseChar()}")
    }
}