package personal.jili.command

/**
 * Created by think on 2015/1/28.
 */
if(args.size()!=1)
    println"Usage :Command9 filename"
else {
    def TIME_PATTERN = '(\\w*)\\s((\\d{1,2}):(\\d{2})([AP ]M))'
    def diary = []

    new File(args[0]).eachLine {entry->
        diary<<entry
    }
    diary.sort{entry1,entry2->
        def matcher1 = entry1 =~TIME_PATTERN
        def matcher2 = entry2 =~TIME_PATTERN
        matcher1.matches()
        matcher2.matches()

        def cmpMeridian = matcher1[0][5]<=>matcher2[0][5]
        def cmpHour =matcher1[0][3].toInteger()<=>matcher2[0][3].toInteger()
        def cmpMinute =matcher1[0][4].toInteger()<=>matcher2[0][4].toInteger()
        return ((cmpMeridian!=0)?cmpMeridian:(cmpHour!=0)?cmpHour:cmpMinute)
    }
    println"Diary events"
    diary.each {entry->println"${entry}"}
}

