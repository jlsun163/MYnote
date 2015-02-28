package per.jili.tehua

/**
 * Created by think on 2015/1/29.
 */

class Account{
    String toString(){
        return "${number};${balance}"
    }

    def number
    def balance
}

class CurrentAccount extends Account{
    String toString(){
        return "Current Account:${number};balance:${balance};overdraft:${overdraftLimit}"
    }

    def overdraftLimit
}

def account = [new Account(number: 'AAA111',balance: 1000),
               new CurrentAccount(number: 'AAA111',balance: 1000,overdraftLimit: 400),
                new CurrentAccount(number: 'BBB222',balance: 2500,overdraftLimit: 800)]

account.each {acc->
    println acc
}