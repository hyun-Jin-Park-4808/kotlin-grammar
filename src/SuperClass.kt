//open class Parent(
//    val familyName: String
//)
//
//class Child(
//    val subName: String,
//    familyName: String
//): Parent(familyName)

open class Parent(
    val familyName: String = "Name"
)

class Child(
    val subName: String
): Parent()