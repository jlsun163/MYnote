package personal.jili.math

/**
 * Created by think on 2015/2/9.
 */

assert [1,[2,3]] .flatten() ==[1,2,3]

assert [1,2,3].intersect([4,3,1]) == [3,1]
assert [1,2,3].disjoint([4,5,6])

list = [1,2,3]
popped = list.pop()
assert popped == 3
assert list == [1,2]

assert [3,1,2].sort() == [1,2,3]

def list = [[1,0],[0,1,2]]
list= list.sort(){a,b -> a[0]<=>b[0]}
assert list ==[[0,1,2],[1,0]]

list = list.sort(){item ->item.size()}
assert list ==[[1,0],[0,1,2]]

list = ['a','b','c']
list.remove(2)
assert list ==['a','b']
list.remove('b')
assert list ==['a']

list =['a','b','c','d']
list.removeAll(['b','c','d'])
assert list == ['a']

def doubled =[1,2,3].findAll{item->
    item*2
}
assert doubled == [2,4,6]

def odd = [1,2,3].findAll{item ->
    item%2 == 1
}
assert odd ==[1,3]