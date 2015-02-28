package personal.jilli.mothod

import personal.jilli.mothod.console.Console

/**
 * Created by think on 2015/1/27.
 */

def hmsToSeconds(h,m,s){
//    return (60*h+m)*60+s
    def totalSeconds = (60*h+m)*60+s
    totalSeconds
}

print"Enter hours toconvert:"
def hours = Console.readInteger()
print"Enter minutes to convert:"
def minutes = Console.readInteger()
print"Enter seconds to convert:"
def seconds =Console.readInteger()


def total = hmsToSeconds(hours,minutes,seconds)
println"Total number of seconds = ${total}"