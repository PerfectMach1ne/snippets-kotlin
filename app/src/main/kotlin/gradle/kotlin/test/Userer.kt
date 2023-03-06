package gradle.kotlin.test

class Userer constructor(var firstName: String = "", var lastName: String = "") {
    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        print("$prefix $lastName")
    }

    fun updateName(newName: String) {
        firstName = newName
    }
}