// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        //silly full stop in the error message caused multiple resubits
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    var initial = args[0].toDouble()
    var maximum = args[1].toDouble()
    var increment = args[2].toDouble()
    val t = Terminal()
    t.println(table{
        header{ row("Celcius", "Fahrenheit")}
        body{
            while (initial <= maximum) {
                row((initial), ((initial * 1.8) + 32))
                initial = initial + increment
            }
        }
    })
}
