// Task 15.2.3: SavingsAccount class
open class SavingsAccount(val rate : Double) : BankAccount(holder, balance, deposit(), withdraw()){
    
    init{
        requrie(holder) {"Holder must exist"}
    }

    fun applyIntrest(){
        val new_balance = balance * (1 + (rate / 100))
        withdraw(balance)
        deposit(new_balance)
    }
}