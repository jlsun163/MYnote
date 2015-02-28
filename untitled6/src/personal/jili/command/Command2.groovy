package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */
if(args.size()!=1)
    println"Usage:Command2 filename"
else {
    new File(args[0].eachLine {line->
        println"Line:${line}"
    })
}
