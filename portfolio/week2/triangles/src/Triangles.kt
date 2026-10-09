// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(shape: Triangle): Boolean {
    //validity check
    var valid = false
    //valid triangle has no one side larger than added squares of other sides
    if (shape.first < (shape.second + shape.third)) {
        if (shape.second < (shape.first + shape.third)) {
            if (shape.third < (shape.first + shape.second)){
                valid = true
            }
        }
    }
    
    return valid
}
fun triangleArea(shape: Triangle): Double {
    //basecase of area
    var area = 0.0
    //had to be changed into doubles as they were expected 
    //tweaked reused week 1 code
    val a = shape.first.toDouble()
    val b = shape.second.toDouble()
    val c = shape.third.toDouble()
    //variable S semi perimiter
    val s = (a + b + c) / 2
    area = sqrt((s) * (s - a) * (s - b) * (s - c))

    return area
}