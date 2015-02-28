package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def values = [1,3,5,7,9].findAll{element->element>6}
values.each {println it}


[1,3,5,7,9].findAll{element->element>6}.each {println it}

values = ['lilei':20,'hanmeimei':22,'xiaoming':25].findAll {staff->staff.value>24}
values.each {println it}