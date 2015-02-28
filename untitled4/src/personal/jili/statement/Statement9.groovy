package personal.jili.statement

import personal.jili.statement.console.Console

/**
 * Created by think on 2015/1/27.
 */
print"Enter examination score:"
def score = Console.readInteger()
def grade

switch (score){
    case 70..100:
        grade='A'
        break
    case 60..69:
        grade='B'
        break
    case 50..59:
        grade='C'
        break
    case 40..49:
        grade='D'
        break
    case 0..39:
        grade='E'
        break
    default:
        grade='O'
        break
}

println"Score:${score};grade:${grade}"