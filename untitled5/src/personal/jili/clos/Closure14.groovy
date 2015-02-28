package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def doubles = {item ->2*item}
def triples = {item->3*item}
def isEven = {item->(item%2==0)}

def map(clos,list){
    return list.collect(clos)
}

println"Doubling:${map(doubles,[1,2,3,4])}"
println"Tripling:${map(triples,[1,2,3,4])}"
println"Evns:${map(isEven,[1,2,3,4])}"