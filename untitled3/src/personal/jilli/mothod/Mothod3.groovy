package personal.jilli.mothod

import personal.jilli.mothod.console.Console

/**
 * Created by think on 2015/1/26.
 */
def processTime(){
    print'Enter the time to be converted:'
    def hours =Console.readInteger()
    def minutes = Console.readInteger()
    def seconds = Console.readInteger()
    def totalSeconds = (60*hours+minutes)*60+seconds
    println"The original time of :${hours} hours,${minutes} minutes" +
            "and ${seconds} seconds"
    println"Converts to :${totalSeconds} seconds"
}

processTime()