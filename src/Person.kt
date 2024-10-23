sealed class Person(
    var name: String,
    var isMarried: Boolean
)

class Developer(
    name: String,
    isMarried: Boolean,
    val language: String
): Person(name, isMarried)

class Marketer(
    name: String,
    isMarried: Boolean,
    val division: Division
) : Person(name, isMarried)

enum class Division {
    CONTENTS, DIGITAL, BRAND
}

fun getSpecialSkill(person: Person) =
    when (person) {
        // smart cast 덕분에 Developer 추가 형변환 필요 없이 language 프로퍼티 사용
        is Developer -> person.language

        // smart cast 덕분에 Marketer로 추가 형변환 필요 없이 division 프로퍼티 사용
        is Marketer -> person.division
    }

fun getSpecialSkillIf(person: Person): String =
    if (person is Developer) {
        println(person.language)
        person.language // if 문이 식이 되면서 마지막 문장에 return 안 써도 마지막 값이 반환된다.
    } else if (person is Marketer) {
        print(person.division)
        person.division.name
    } else throw RuntimeException()

