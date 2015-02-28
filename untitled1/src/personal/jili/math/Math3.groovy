package personal.jili.math

/**
 * Created by think on 2015/2/4.
 */
myList = [1,2,3]

assert myList.size() ==3
assert myList[0] ==1
assert myList instanceof ArrayList
empryList =[]
assert empryList.size() == 0
longList = (0..1000).toList()
assert longList[555] == 555

explicitList = new ArrayList()
explicitList .addAll(myList)
assert explicitList.size() == 3
assert explicitList[0] == 10

explicitList = new LinkedList()
assert explicitList.size() == 3
explicitList[0] = 10
assert  explicitList[0] == 10