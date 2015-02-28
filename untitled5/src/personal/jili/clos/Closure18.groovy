package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def multiply(x){
    return {y->return x*y}
}
def twice = multiply(2)

println"twice(4):${twice(4)}"

def multiplication = {x->return {y->return x*y}}

def quadruple = multiplication(4)

println"quadruple(3):${quadruple(3)}"