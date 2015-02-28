package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def value = [1,3,5,7,9].find{element->element>6}
println"Found:${value}"

value =[1,3,5,7,9].find{element->element>10}
println "Found:${value}"

value = ['lilei':20,'hanmeimei':22,'xiaoming':25].find {staff->staff.value>21}
println"Found:${value}"