package personal.jilli.mothod

/**
 * Created by think on 2015/1/27.
 */
def sort(list, ascending =true){
    list.sort()
    if(ascending ==false)
        list.reverse()
    return list
}
def numbers = [10,5,3,6]
assert (sort(numbers,false)==[10,6,5,3])