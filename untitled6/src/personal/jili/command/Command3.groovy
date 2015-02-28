package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */
def chars =0
def words =0
def lines =0

if(args.size()!=1)
    println"Usage:Command3 filename"
else {
    new File(args[0]).eachLine {line->
        chars+=1 +line.length()
        words+=line.tokenize().size()
        line++
    }
    println"chars:${chars};words:${words};lines:${lines}"
}