val set = setOf(1, 2, 3)
val list = listOf("a", "b", "1L")
val map = mapOf(
    1 to "One",
    3 to "Three"
)

fun getMyName(
    firstName: String = "foo",
    lastName: String = "bar"
): String = "$firstName $lastName"

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    println(getMyName("Steve", "Jobs"))
    println(getMyName("Jobs", "Steve"))
    println(getMyName(firstName = "Steve", lastName = "Jobs"))
    println(getMyName())
    println(getMyName("Steve"))
    println(getMyName(lastName = "Jobs"))
}