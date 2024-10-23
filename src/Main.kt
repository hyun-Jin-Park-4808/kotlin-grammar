fun main() {
    val value: Int = max(5, 3)
    println("Max value is : $value")

    println("Max value is : ${max(5, 3)}")

    val person = Person("November", false)
    person.name = "new Name"
    person.isMarried = true

    println("person name : ${person.name}, isMarried: ${person.isMarried}")
}

fun max(a: Int, b: Int):Int = if (a > b) a else b // option + enter 누르면 이렇게 한 줄로 바꿔준다.
