// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    //error handling
    require(data.isNotEmpty()) {"List must have elements"}
    
    val sortedData = data.sorted()
    val size = sortedData.size
    
    if (size % 2 != 0) {
        return(sortedData[size / 2])
    } 
    else {
        return(((sortedData[(size / 2) - 1] + sortedData[size / 2]) / 2.0).toFloat())
    }
}
