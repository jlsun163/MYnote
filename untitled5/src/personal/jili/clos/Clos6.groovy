package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def greeting = 'Hello'
def clos ={param->println"${greeting}${param}"}

def demo(clo){
    def greeting = 'hanmeimei'
    clo.call('hanmeimei')
}
//demo()clos

demo(){param->println"Welcome ${param}"}

demo clos
demo {param->println"Welcome ${param}"}

