package personal.jili.lei

/**
 * Created by think on 2015/1/29.
 */
def acc = new Account(number: 'ABC123',balance: 1200)
acc.display()

acc.credit(200)
acc.display()

acc.debit(900)
acc.debit(700)
acc.display()