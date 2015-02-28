package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def anyElement = [11,12,13,14].any{element->element>12}
println"anyElement:${anyElement}"

def allElements = [11,12,13,14].every{element->element>10}
println"allElements:${allElements}"

def anyStaff = ['lilei':20,'hanmeimei':22,'xiaoming':25].any {staff->staff.value>30}
println "anyStaff:${anyStaff}"

