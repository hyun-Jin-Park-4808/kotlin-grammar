data class Person(
    var name: String,
    var age: Int
)

val persons = listOf(
    Person("Captain", 44),
    Person("Cyclops", 35),
    Person("Deadpool", 31),
    Person("Iceman", 54),
    Person("Loki", 54),
    Person("Hulk", 54),
)

enum class Division {
    CONTENTS, DIGITAL, BRAND
}

fun sum(x: Int, y: Int): Int = x + y
val sumLambda = { x: Int, y: Int -> x + y }


fun main() {
    println(personsList.maxByOrNull { it.age })
    println(personsList.groupBy { it.age })

    // 일반 함수 호출
    println(sum(12, 34))
    // 람다 함수 호출
    println(sumLambda(12, 34))
    // 람다 수식 바로 실행
    println({ x: Int, y: Int -> x + y }(12, 34))

    println(personsList.filter { it.age > 36 })
    println(personsList
        .filter { it.age > 36 }
        .map { "${it.name}'s age is ${it.age}" }
    )
    val strings = listOf("abc", "def")
    println(strings.map { it.toList() })
    println(strings.map { it.toList() }.flatten())
    println(strings.flatMap { it.toList() })

    println(
        personsList.map {
            println(it)
            it.name
        }.find { it.startsWith("I") }
    )
    println(
        personsList.asSequence()
            .map {
                println(it)
                it.name
            }.find { it.startsWith("I") }
    )
}
