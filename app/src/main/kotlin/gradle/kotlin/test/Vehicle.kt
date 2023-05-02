package gradle.kotlin.test

class Vehicle {
    var brand: String = "unknown"

    fun info() = println(brand)

    inner class SteeringWheel {
        var name = "The Steering Wheel"
//        fun info() = println(name)

        // by default nexted classes do not have access to the member variables of the outer class
        // ... so, initailly, $brand plops out an error. unless we declare 'SteeringWheel' as 'inner class'
        fun info() = println("$brand is the brand of the vehicle with a $name steering wheel")
    }


    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}