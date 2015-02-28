package personal.jili.math

/**
 * Created by think on 2015/2/6.
 */

myList = []

myList+='a'
assert myList == ['a']

myList = []
myList << 'a' <<'b'
assert myList ==['a','b']
assert  myList -['b'] ==['a']

assert  myList*2 ==['a','b','a','b']