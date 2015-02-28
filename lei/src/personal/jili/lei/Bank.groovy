package personal.jili.lei

/**
 * Created by think on 2015/1/29.
 */
class Bank {
    def name
    def accounts =[:]

    def openAccount(number,balance){
        def acc = new Account(number, balance)
    }

    def credotAccount(number,amount){
        def acc =this.findAccount(number)
        if (acc!=null)
            acc.credit(amount)
    }

    def debitAccount(number,amount){
        def acc =this.findAccount(number)
        if (acc!=null)
            acc.debit(amount)
    }

    def getAccountBalance(number){
        def acc = this.findAccount(number)
        return (acc==null)?null:acc.balance
    }

    def getTotalAssets(){
        def total =0
        accounts.each {number,account->total+=account.balance}
    }

    def findAccount(number){
        def acc =accounts.find {entry->entry.key==number}
        return (acc==null)?null:acc.value
    }
}
