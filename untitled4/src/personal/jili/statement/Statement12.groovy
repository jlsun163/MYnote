package personal.jili.statement

import personal.jili.statement.console.Console

/**
 * Created by think on 2015/1/27.
 */
def MAX = 10
def sum = 0

for (k in 1..MAX){
    print"Enter next value:"
    def value = Console.readInteger()
    if (value<0)
        continue
    sum+=value
}

println"sum:${sum}"