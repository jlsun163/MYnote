package personal.jili.math

/**
 * Created by think on 2015/2/10.
 */
def myMap = [a:1,b:2,c:3]
def other = [b: 2,c: 3,a: 1]

assert myMap == other

assert myMap.isEmpty() == false
assert myMap.size() == 3
assert myMap.containsKey('a')
assert myMap.containsValue(1)
assert myMap.keySet() == toSet(['a','b','c'])
assert toSet(myMap.values()) == toSet([1,2,3])
assert myMap.entrySet() instanceof Collection

assert myMap.any {entry -> entry.value>2}
assert myMap.every {entry -> entry.key<'d'}

def toSet(list){
    new HashSet(list)
}