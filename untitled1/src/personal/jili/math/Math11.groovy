package personal.jili.math

/**
 * Created by think on 2015/2/10.
 */
def myMap = [a:1,b:2,c:3]

def store = ''
myMap.each {entry->
    store+=entry.key
    store+=entry.value
}
assert store.contains('a1')
assert store.contains('b2')
assert store.contains('c3')

store = ''
myMap.each {key,value ->
    store+=key
    store+=value
}
assert store.contains('a1')
assert store.contains('b2')
assert store.contains('c3')

store = ''
for (key in myMap.keySet()){
    store+=key
}
assert store.contains('a')
assert store.contains('b')
assert store.contains('c')

store = ''
for (value in myMap.values()){
    store+=value
}
assert store.contains('1')
assert store.contains('2')
assert store.contains('3')