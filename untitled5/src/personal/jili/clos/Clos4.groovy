package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def greeting = 'Hello'
def clos = {param->println"${greeting} ${param}"}
clos.call('world')
greeting = 'Welcome'
clos.call('world')