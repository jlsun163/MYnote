package personal.jili.clos

/**
 * Created by think on 2015/1/27.
 */
def clos = {param -> println"Hello ${param}"}

clos.call('world')
clos.call('again')
clos('shortcut')