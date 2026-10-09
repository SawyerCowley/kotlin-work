// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

/*
Herrons foruma for area given three sides
*/
fun main(args: Array<String>) {
    if (args.size != 3) {
        //silly full stop in the error message caused multiple resubits
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    //arguments
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()
    //variable S semi perimiter
    val s = (a + b + c) / 2
    val area = sqrt((s) * (s - a) * (s - b) * (s - c))
    //output
    println("Area = %.5f".format(area))
}