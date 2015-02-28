package personal.jili.statement

import personal.jili.statement.console.Console

/**
 * Created by think on 2015/1/27.
 */
def sum =0

print"Enter first value:"
def data = Console.readInteger()
while (data>=0){
    sum+=data
    print"Enter next value:"
    data = Console.readInteger()
}

println"The sum is:${sum}"