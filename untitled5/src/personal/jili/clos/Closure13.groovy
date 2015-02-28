package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def list =[1,2,3,4].collect{element-> return element*element}
println"list:${list}"

list=[1,2,3,4].collect{element->element*element}
println"list:${list}"

list =(0..<5).collect{element->2*element}
println"list:${list}"

def staff = ['lilei':20,'hanmeimei':22,'xiaoming':25]
list = staff.collect{entry->++entry.value}
def olderStaff = staff.collect{entry->++entry.value;return entry}
println"staff:${staff}"
println"list:$staff"
println"olderStaff:$olderStaff"