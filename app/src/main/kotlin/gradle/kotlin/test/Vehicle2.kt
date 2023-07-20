package gradle.kotlin.test

internal class Axle(val numberOfWheels: Int) {

}

open class Vehicle2(var color: String) {
    private lateinit var axles: MutableList<Axle>

    fun info() {
        println("The vehicle is $color")
    }

    fun addAxle(numberOfWheels: Int) {
        axles.add(Axle(numberOfWheels))
    }
}

class Truck(color: String) : Vehicle2(color) {
    init {
//        axles = arrayOf(Axle(2), Axle(4))
        addAxle(2)
        addAxle(4)
    }
}