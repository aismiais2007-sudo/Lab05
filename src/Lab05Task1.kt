fun main() {
    val letter: Char = 'K'
    val word: String = "K"

    println("letter = $letter")
    println("word = $word")

    // 'letter' is a single 16-bit Unicode character (Char), whereas 'word' is a sequence of characters (String).

    println("word[0] = ${word[0]}")
}