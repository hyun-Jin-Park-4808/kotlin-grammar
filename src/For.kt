import java.util.*

fun evenOrOdd(n: Int) = when {
    n % 2 == 0 -> "even"
    else -> "odd"
}

fun main() {
    // 1~100 까지(100 포함)
    for (i in 1..100)
        println(evenOrOdd(i))

    // 100~1까지 (3 간격으로, 100, 97 ~ 1)
    for (i in 100 downTo 1 step 3)
        println(evenOrOdd(i))

    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((key, value) in binaryReps) {
        println("문자:$key = 아스키코드:$value")
    }
}

fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "숫자"
    in 'a'..'z', in 'A'..'Z' -> "알파벳"
    else -> "숫자도 알파벳도 아님"
}

