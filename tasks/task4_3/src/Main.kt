// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        //silly full stop in the error message caused multiple resubits
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val score = (args[0].toFloat() + args[1].toFloat() + args[2].toFloat()) / 3
    val rounded_score: Int = score.roundToInt()
    val grade = when (rounded_score) {
        in 0..39  -> "Fail"
        in 40..69 -> "Pass"
        in 70..10 -> "Distinction"
        else -> "?"
    }
    println(grade)
}