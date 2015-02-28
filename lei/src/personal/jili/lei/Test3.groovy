package personal.jili.lei

/**
 * Created by think on 2015/1/29.
 */
def acc1 = new Account(number: 'ABC123',balance: 1200)
def acc2 = new Account(number: 'PQR456',balance: 200)
def acc3 = new Account(number: 'XYZ789',balance: 123)

def accounts = [acc1,acc2,acc3]

accounts.each {acc->
    print acc
//            .toString()
//            .display()
}