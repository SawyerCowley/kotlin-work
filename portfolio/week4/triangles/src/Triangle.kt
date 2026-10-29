// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

class Triangle constructor (val sideA: Double, val sideB: Double, val sideC: Double){

    //initialisation requires sides to be valid
    init {
        require(isValidTriangle()) {"Invalid triangle"}
    }

    // Add isValidTriangle() and triangleArea() functions here
    fun isValidTriangle(): Boolean {
        //validity check
        var valid = false
        //valid triangle has no one side larger than added squares of other sides
        if (sideA < (sideB + sideC)) {
            if (sideB < (sideA + sideC)) {
                if (sideC < (sideA + sideB)){
                    valid = true
                }
            }
        }
        return valid
    }

    fun triangleArea(): Double {
        //validity is known in class
        var area = 0.0
        area = sqrt((semiPerimeter) * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
        return area
    }


    //properties
    val perimeter: Double get() = sideA + sideB + sideC
    val semiPerimeter: Double get() = perimeter / 2
    val area: Double get() = triangleArea()

    override fun toString(): String {
        return("Triangle(${sideA}, ${sideB}, ${sideC})")
    }

}