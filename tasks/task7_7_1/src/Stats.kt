// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    //error handling
    require(data.isNotEmpty()) {"List must have elements"}
    
    val sortedData = data.sorted()
    val size = sorted.size
    
    if (size % 2 != 0) {
        return(sorted[size / 2])
    } 
    else {
        return((sorted[(size / 2) - 1] + sorted[size / 2]) / 2.0)
    }
}
