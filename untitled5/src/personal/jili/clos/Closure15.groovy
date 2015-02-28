package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def factorial =[2,3,4,5].inject (1){previous,element->previous*element}
println"Factorial(5):${factorial}"

def fact =1
[2,3,4,5].each {number->fact*=number}
println"fact:${fact}"

def list = [2,3,4,5]
factorial = list.inject(1) {previous,element->previous*element}
println"Factorial(5):$factorial"

list = [2,3,4,5]
def closure = {previous,element->previous*element}
factorial = list.inject(1,closure)
println"Factorial(5):${factorial}"