val set = setOf(1, 2, 3)
val list = listOf("a", "b", "1L")
val map = mapOf(
    1 to "One",
    3 to "Three"
)

fun String.double(add: String) = this + this + add

infix fun String.add(postfix: String) = this + postfix

infix fun String.equalTo(expected: String) =
    this == expected

fun getMyName(
    firstName: String = "foo",
    lastName: String = "bar"
): String = "$firstName $lastName"

fun main() {
    println("This is very ".add("good"))
    println("This is very " add "good")
    println("xxxy" equalTo "xxxy")
    println("do".double(" is the best"))
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    println(getMyName("Steve", "Jobs"))
    println(getMyName("Jobs", "Steve"))
    println(getMyName(firstName = "Steve", lastName = "Jobs"))
    println(getMyName())
    println(getMyName("Steve"))
    println(getMyName(lastName = "Jobs"))

    val person = Pair("Snow", true)
    val (name, isMarried) = person

    val persons = mapOf(
        "Snow" to true,
        "Peter" to false,
        "Paul" to true,
    )

// map iteration 시에 분해해서 접근
    persons.forEach {
            (name, isMarried) ->
        println("$name is married($isMarried)")
    }

// isMarried 미사용
    persons.forEach {
            (name, _) ->
        println("$name is in this list")
    }
}