package personal.jili.lei

/**
 * Created by think on 2015/1/29.
 */
def bk = new Bank()
bk.name = 'hahaha'

bk.openAccount('ABC123',1200)
bk.openAccount('DEF456',1000)
bk.openAccount('GHI789',2000)

bk.credotAccount('ABC123',200)
bk.debitAccount('ABC123',900)
bk.debitAccount('ABC123',700)

println"Balance for account ABC123 is :${bk.getAccountBalance('ABC123')}"
println"Total assets:${bk.getTotalAssets()}"