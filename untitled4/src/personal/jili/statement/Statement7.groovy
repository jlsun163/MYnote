package personal.jili.statement

import personal.jili.statement.console.Console

/**
 * Created by think on 2015/1/27.
 */
print"Enter first value:"
def first = Console.readInteger()
print"Enter second value:"
def second = Console.readInteger()

if(first<second)
    println"${first} and ${second}"
else
    println"${second} and ${first}"