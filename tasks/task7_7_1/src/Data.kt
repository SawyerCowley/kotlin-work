// Task 7.7.1: data handling functions
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(file: Sting) = buildList {
    Path(filename).forEachLine {
        add(it.toFloat())
    }
}