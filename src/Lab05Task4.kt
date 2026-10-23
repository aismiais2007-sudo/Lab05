fun main() {
    print("Enter a digit character: ")
    val line = readln()
    if (line.isNotEmpty()) {
        val ch = line[0]
        val value = ch - '0'

        println("value = $value")
        println("value * 2 = ${value * 2}")
    }
}