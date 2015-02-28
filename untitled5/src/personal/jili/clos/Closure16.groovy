package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def fiter(list,predicate){
    return list.findAll(predicate)
}

def isEven ={x->return (x%2==0)}
def isOdd = {x->return !isEven(x)}

def table =[11,12,13,14]

def evens = fiter(table,isEven)
println"evens:${evens}"

def oods =fiter(table,isOdd)
println"oods:${oods}"