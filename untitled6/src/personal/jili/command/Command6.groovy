package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */
if(args.size()!=2)
    println"Usgae:Command filename filename"
else {
    def outFile = new File(args[1])
    if(outFile.exists())
        outFile.delete()
    def printWriter = outFile.newPrintWriter()

    new File(args[0]).eachLine {line->
        printWriter.println(line)
    }
    printWriter.flush()
    printWriter.close()
}