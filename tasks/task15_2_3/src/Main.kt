// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val b1 = BankAccount("Baja")
    b1.Deposit(150)
    println(b1.balance)
    b1.Withdraw(50)
    println(b1.balance)
    val s1 = SavingsAccount(1.5)
    s1.applyIntrest()
    
}
