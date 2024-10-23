fun main() {
    val value: Int = max(5, 3)
    println("Max value is : $value")

    println("Max value is : ${max(5, 3)}")

    val developer = Developer("zero", true, "Kotlin")
    var marketer = Marketer("mark", false, Division.BRAND)

    println("developer's special skill is : ${getSpecialSkill(developer)}")
    println("marketer's special skill is : ${getSpecialSkill(marketer)}")

//    val person = Person("November", false)
//    person.name = "new Name"
//    person.isMarried = true
//
//    println("person name : ${person.name}, isMarried: ${person.isMarried}")
}

fun max(a: Int, b: Int):Int = if (a > b) a else b // option + enter 누르면 이렇게 한 줄로 바꿔준다.
