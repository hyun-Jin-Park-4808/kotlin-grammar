//class User constructor(_userName: String) {
//    val userName: String
//
//    init {
//        this.userName = _userName
//    }
//}

//class User constructor(_userName: String) {
//    val userName: String = _userName
//}

class User constructor(var userName: String = "defaultName")

data class Knight(val grade: String, val age: Int)

val userName = User().userName

class NewChild(
    private val subName: String,
    familyName: String,
    private val age: Int
) : Parent(familyName) {

    companion object {
        const val MAX_CHILDREN_COUNT = 4
        fun ofDefaultAge(
            subName: String, familyName: String
        ): NewChild = NewChild(
            "defaultName",
            "defaultFamilyName",
            10
        )
    }
}

fun main() {
    println(Knight("Zero", 24)) // Knight(grade=Zero, age=24)
}
