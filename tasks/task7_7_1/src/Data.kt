// Task 7.7.1: data handling functions
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(file: String) = buildList {
    Path(file).forEachLine {
        add(it.toFloat())
    }
}