package personal.jilli.mothod

import personal.jilli.mothod.console.Console

/**
 * Created by think on 2015/1/26.
 */
def reverse(){
    print "Enter the two integer values:"
    def first = Console.readInteger()
    def second = Console.readInteger()
    println"Reversed values:${second} and ${first}"
}
reverse()