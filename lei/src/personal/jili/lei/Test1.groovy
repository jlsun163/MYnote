package personal.jili.lei

/**
 * Created by think on 2015/1/28.
 */
def acc = new Account(number: 'ABC123',balance: 1200)
def acc2 = new Account(number: 'XYZ888',balance: 400)

println"Account ${acc.number} has balance ${acc.balance}"
println"Account ${acc2.getNumber()} has balance ${acc2.getBalance()}"

acc.balance =200
println"Account ${acc.getNumber()} has balance ${acc.getBalance()}"

acc2.setBalance(600)
println"Account ${acc2.number} has balance ${acc2.balance}"