fun main() {
    println("RED is ${getKoreanColorName(Color.RED)}")
    println("RED is ${getKoreanColorsName(Color.ORANGE)}")
}

// 가장 간결한 enum class
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

// 하나의 값에 1:1 조건
fun getKoreanColorName(color: Color) =
    when (color) {
        Color.RED -> "빨강"
        Color.ORANGE -> "오렌지"
        Color.YELLOW -> "노랑"
        Color.GREEN -> "녹색"
        Color.BLUE -> "파랑"
    }

// 다중 값 조건
fun getKoreanColorsName(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE -> "빨강 또는 오렌지"
        Color.YELLOW -> "노랑"
        Color.GREEN, Color.BLUE -> "녹색 또는 파랑"
    }

fun mix(c1: Color, c2: Color) =
    when {
        c1 == Color.RED && c2 == Color.YELLOW -> "오렌지"
        c1 == Color.YELLOW && c2 == Color.BLUE -> "녹색"
        else -> throw RuntimeException()
    }