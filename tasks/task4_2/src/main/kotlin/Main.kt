// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU")
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood \n(d) Hawaiian \n")
    val choice = readln()
    if (choice in "a".."d"){
        println("Order accepted")
    }
    else{
        println("order not possible")
    }
}
