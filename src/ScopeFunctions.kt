val personsList = listOf(
    Person("Captain", 44),
    Person("Cyclops", 35),
    Person("Deadpool", 31),
    Person("Iceman", 54),
    Person("Loki", 54),
    Person("Hulk", 54),
)

fun main() {
    // 특정 값에 대해 사용 영역을 명확히 하기 위해 사용한다.
    // 객체 참조: this
    // 응답: 람다식 결과
    with(personsList[1]) {
        println(age)
        println(name)
    }

    // 객체의 값을 한 번에 여러 개 설정하는 경우
    // 객체 참조: this
    // 응답: 객체 자신
    personsList[2].apply {
        this.name = "newName"
        this.age = 72
    }

    // nullable한 값을 확인해 not null인 경우 실행하는 데 주로 사용한다.
    // 객체 참조: it
    // 응답: 람다식 결과를 넘겨준다.
    personsList.find { it.age > 60 }?.let { // 전부 null이면 아래 로직 실행 안 한다.
        println("===나이 60 넘는 사람 리스트===")
        println(it)
        println("===")
    }

    // 추가적인 효과를 적용하기 위해 주로 사용한다.
    // 객체 참조: it
    // 응답: 객체 자신
    personsList.also {
        if (personsList.size < 5) throw IllegalStateException("persons의 크기가 너무 적다.")
        println("persons를 모두 완성했다. 이젠 뭐하지?")
    }

    // 객체의 값 설정, 추가적인 연산 진행에 사용
    // 객체 참조: this
    // 응답: 람다식 결과 응답
    personsList.run {
        println(this.map { "${it.name}'s age: ${it.age}" })
        println(this.map { "${it.name}의 나이는 ${it.age}살" })
    }
}