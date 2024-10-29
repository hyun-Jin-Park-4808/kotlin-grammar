class Account {
    var balance: Long = 0
        private set

    var accountName: String = ""
        get() = "계좌이름: $field"

    fun increaseBalance(value: Int) {
        if (this.balance + value > 1_000_000) throw IllegalStateException("Balance cannot be over 1million")
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        if (this.balance - value < 0) throw IllegalStateException("Balance is negative")
        this.balance -= value
    }
}

fun main() {
    val account = Account()
    account.increaseBalance(100)
    account.increaseBalance(100)
    account.increaseBalance(100)
    account.increaseBalance(100)
    account.decreaseBalance(100)
    account.accountName = "급여 계좌"

    println("${account.accountName} 잔액: ${account.balance}원") // 계좌이름: 급여 계좌 잔액: 300원

}