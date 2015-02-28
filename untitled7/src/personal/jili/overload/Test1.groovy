package personal.jili.overload

/**
 * Created by think on 2015/2/2.
 */
def buck = new Money(1,'USD')
assert buck
assert buck == new Money(1,'USD')
assert buck + buck == new Money(2,'USD')