package ro.develop.bankaccountprogram

fun main(){
    val ayushBankAccount = BankAccount("Ayush", 5000.00)

    ayushBankAccount.deposite(4000.65)
    ayushBankAccount.withdraw(7000.43)
    ayushBankAccount.withdraw(3000.32)
    ayushBankAccount.deposite(12000.34)
    ayushBankAccount.displayTranctionHistory()
//    println("${ayushBankAccount.accountHolder}'s balance is ${ayushBankAccount.balance}")
//    println(ayushBankAccount.acctBalanace())
    println("${ayushBankAccount.accountHolder}'s balance is ${ayushBankAccount.acctBalance()}")

    val sarahBankAccount = BankAccount("Sarah", 0.00)
    sarahBankAccount.deposite(100.00)
    sarahBankAccount.withdraw(10.00)
    sarahBankAccount.deposite(300.00)
    sarahBankAccount.displayTranctionHistory()
    println("${sarahBankAccount.accountHolder}'s balance is ${sarahBankAccount.acctBalance()}")
}