fun main() {
    print("Enter character: ")
    val line = readln()
    if (line.isNotEmpty()) {
        val ch = line[0]

        val classification = when (ch) {
            in '0'..'9' -> "Digit"
            in 'A'..'Z' -> "Uppercase"
            in 'a'..'z' -> "Lowercase"
            else -> "Other"
        }

        println(classification)
    }
}