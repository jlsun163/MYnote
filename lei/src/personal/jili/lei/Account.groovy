package personal.jili.lei

/**
 * Created by think on 2015/1/28.
 */
class Account {
    def number
    def balance

    def Account(number, balance) {
        this.number = number
        this.balance = balance
    }

    def credit(amount){
        balance+=amount
    }

    def debit(amount){
        if(balance>=amount)
            balance=amount
    }

    def display(){
        println"Account:${number} with balance:${balance}"
    }

    String toString(){
        return "Account:${number} with balance:${balance}"
    }
}
