package gradle.kotlin.test

class Userer constructor(var firstName: String = "", var lastName: String = "") {
    var fullName: String = "$firstName $lastName"
        get() = "Name: $field" // override fullname getter
        set(value) {
            if (value.startsWith("Jeff")) {
                field = "Jeff Doe"
            }
        }

    fun fullName(): String {
        return "$firstName $lastName"
    }

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        print("$prefix $lastName")
    }

    fun updateName(newName: String) {
        firstName = newName
    }

    override fun toString(): String {
        return fullName()
    }
}