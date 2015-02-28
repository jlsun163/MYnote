package personal.jili.statement

/**
 * Created by think on 2015/1/27.
 */
def staff = ['lilei':21,'hanmeimei':25,'xiaoming':22]

def tatalAge = 0
for (staffEntry in staff)
    tatalAge += staffEntry.value
println"Total staff age:${tatalAge}"