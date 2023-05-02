package gradle.kotlin.test

class LateInitUser(var firstName: String, var lastName: String) {

//    var favouriteCity: String = ""
    // Telling Kotlin "I'm going to initialize it later, I promise"
    lateinit var favouriteCity: String
    // lateinit val won't work together, because lateinit requires a variable to be mutable!!! And val is not!!!!!

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName() + "'s favourite city is $favouriteCity"
    }
}