package personal.jilli.mothod

import personal.jilli.mothod.console.Console

/**
 * Created by think on 2015/1/27.
 */

def swap(x,y){
    def temp = x
    x=y
    y=temp
}

print"Enter the first value:"
def first = Console.readInteger()
print"Enter the second value:"
def second = Console.readInteger()

swap(first,second)
println"first:${first}"
println"second:${second}"
