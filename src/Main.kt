fun main() {
    val i = 1
    val l: Long = 100_000_000_000L
    val ll: Long = i.toLong()

    val nullablePerson: Person? =
        if (System.currentTimeMillis() % 2 === 0L)
            Person("Even", 22)
        else null

    // if 검사 등으로 특정 영역에서는 not null 타입처럼 사용이 가능하다.
    if (nullablePerson != null) {
        println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson.age}")
    }

    // ?. 호출을 수행: 값이 있는 경우는 호출 결과, 값이 없는 경우는 null
    println("짝수 시간에만 존재하는 사람의 나이는: ${nullablePerson?.age}")

    // !!. 호출을 수행: 값이 없는 경우 NPE가 발생 => 선호되지 않는다. 이렇게 하지 말기!
    println("짝수 시간에만 존재하는 사람의 나이는: ${nullablePerson!!.age}")
}

