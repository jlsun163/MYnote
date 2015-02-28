package personal.jili.library

/**
 * Created by think on 2015/1/26.
 */

def library = ['xiaoming':['Groovy','UML'],
                'lilei':['Java']
                ]
library['hanmeimei']=['Basic']
library['lilei']=library['lilei']<<'OOD'

println"Library:$library"
println"Xiaoming has borrowed UML?${library['xiaoming'].contains('UML')}"
println"Number of borrowers is in the library:${library.size()}"
println"Library ${library.keySet().sort()}"
println"Number of books borrowed by Xiaoming:${library['xiaoming'.size()]}"