// Task 5.1.1: main program
fun main(args: Array<String>){
    if (args.size != 2){
        println("only 2 arguments please")
        System.exit(2)
    }
    val compareValue = anagrams(args[0], args[1])
    if (compareValue){
        println("both are anagrams!")
        System.exit(0)
    }
    print("fake millionaires")
    System.exit(0)
}