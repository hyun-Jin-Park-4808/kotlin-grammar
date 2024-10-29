import Error.*

sealed class Error {

    class FileError(val fileName: String) : Error()

    class DatabaseError(val dbmsType: DbmsType) : Error()

    class OsError(val osType: OsType): Error()
}

enum class OsType {
    WINDOWS, MACOS, LINUX
}

enum class DbmsType {
    MYSQL, MARIA, ORACLE, H2
}

fun getCharacter(error: Error) = when (error) {
    is FileError -> "Error is occurred at $(error.fileName}"
    is DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    is OsError -> "Error on DBMS : ${error.osType}"
}

fun main() {
    println(getCharacter(Error.OsError(OsType.MACOS)))
}