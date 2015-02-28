package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def greeting = "hello"
def clos = {param ->println"${greeting}${param}"}
clos.call('world')
greeting = 'Welcome'
clos.call('world')
def demo(clo){
    def greeting = 'Bonjour'
    clo.call('hanmeimei')
}

demo(clos)
//demo()clos