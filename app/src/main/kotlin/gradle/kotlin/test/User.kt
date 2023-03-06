package gradle.kotlin.test

class User {
    var firstName: String = ""
    var lastName: String = ""

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        print("$prefix $lastName")
    }
}