package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */
def printDir(dirName,size){
    new File(dirName).eachFileRecurse {file->
        if (file.length()>size)
            println"${file.getName()}"
    }
}

if (args.size()!=2||new File(args[0]).isDirectory()==false)
    println"Usage:Command5 directory"
else {
    printDir(args[0],args[1].toInteger())
}
