package personal.jili.statement.console

/**
 * Created by think on 2015/1/26.
 */
class Console {
    def static readLine(){
        return getNextLine()
    }
    def static readString(){
        return getNextToken()
    }

    def static readInteger(){
        return getNextToken().toInteger()
    }

    def static readBoolean(){
        return (getNextToken()=="true")
    }

    def static readDouble(){
        return getNextToken().toDouble()
    }

    private static String getNextToken(){
        if(inputLine ==null)
            readInputLine()
        while (inputIndex==numberOfTokens)
            readInputLine()
        return inputTokens[inputIndex++]
    }

    private static String getNextLine(){
        if(inputLine ==null)
            readInputLine()
        while (inputLine==numberOfTokens)
            readInputLine()
        def line = inputTokens [inputIndex..<numberOfTokens].join(' ')
        inputIndex=numberOfTokens
        return line
    }

    private static void readInputLine(){
        inputLine = new BufferedReader(new InputStreamReader(System.in)).readLine()
        inputTokens = inputLine.tokenize()
        numberOfTokens = inputTokens.size()
        inputIndex =0
    }

    private static String inputLine = null
    private static List  inputTokens = null
    private static int numberOfTokens = 0
    private static int inputIndex =-1
}
