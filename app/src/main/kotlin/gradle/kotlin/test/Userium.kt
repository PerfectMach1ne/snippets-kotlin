package gradle.kotlin.test

class Userium(var firstName: String, var lastName: String) {
    private val MAX_AGE = 18

    // function or property that's going to be tied directly to class rather than to its exact instances
    // It's like a Java static method
    // A companion object is a singleton
    companion object {
        const val MAX_AGE_2 = 18

        val users = mutableListOf<Userium>() // Returns an empty new MutableList.

        fun createUsers(count: Int): List<Userium> {
            for (i in 0..count) {
                users.add(Userium("FirstName$i", "LastName$i"))
            }
            return users
        }

        fun createUser(firstName: String, lastName: String): Userium {
            return Userium(firstName, lastName)
        }
    }

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName()
    }
}