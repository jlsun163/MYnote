package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */

if(args.size()!=2)
    println"Usage :Command7 filename filename"
else {
    new File(args[1]).withPrintWriter {printwriter->
        new File( args[0]).eachLine {line->
            printwriter.println(line)
        }
    }
}