package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */
if(args.size()!=1)
    println"Usage:Command8 filename"
else {
    def lines =[]

    new File(args[0]).eachLine {line->
        lins<<line
    }
    lines.sort()

    new File(args[0]).withPrintWriter {printWriter->
        lines.each {line->
            printWriter.println(line)
        }
    }
}
