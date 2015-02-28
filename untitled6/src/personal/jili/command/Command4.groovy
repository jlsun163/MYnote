package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */
def listDir(dirFile,indent){
    dirFile.eachFile{file->
        (0..<indent).each {print" "}
        println"${file.getName()}"
        if(file.isDirectory())
            listDir(file,2+indent)
    }
}

def printDir(dirName){
    listDir(new File(dirName),0)
}

if(args.size()!=1||new File(args[0]).isDirectory()==false)
    println"Usage:Command4 directory"
else {
    printDir(args[0])
}