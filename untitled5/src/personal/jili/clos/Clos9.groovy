package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
[1,2,3,4].each {num->if(num%2 ==0)println num}

['lilei':20,'hanmeimei':22,'xiaoming':25].each {staff->
    if (staff.value>=25)println staff.key
}

['lilei':20,'hanmeimei':22,'xiaoming':25].each {staffName,staffAge->
    if (staffAge>=25)println staffName
}

'lilei'.each {letter->if(letter>='a'&&letter<='z')println letter}
