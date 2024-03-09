package ro.develop.bankaccountprogram

class BankAccount(
    var accountHolder : String,
    var balance : Double)
{
    private val transactionHistory = mutableListOf<String>()

    fun deposite(amount : Double){
        balance +=amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount : Double ){
        if(amount <=balance){
            balance -=amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }
        else {
            println("Insufficient balance to withdraw $$amount")
        }
    }

    fun displayTranctionHistory(){
        println("Transaction history of $accountHolder")
        for(transaction in transactionHistory ){
            println(transaction)
        }
    }

    fun acctBalance(): Double {
        return balance
    }
}