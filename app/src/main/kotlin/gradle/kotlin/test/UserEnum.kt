package gradle.kotlin.test

class UserEnum(var firstName: String, var lastName: String, var accountType: AccountType = AccountType.BRONZE) {

//    var accountType: AccountType = AccountType.BRONZE
    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName()
    }
}