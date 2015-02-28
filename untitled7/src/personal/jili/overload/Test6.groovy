package personal.jili.overload

/**
 * Created by think on 2015/2/3.
 */
twister = 'she sells sea shells at the sea shore of seychelles'

regex = /\b(\w)\w*\l\b/

start = System.currentTimeMillis()

10000.times {
    twister =~regex
}
first = System.currentTimeMillis() -start

start = System.currentTimeMillis()
pattern = ~regex

10000.times {
    pattern.matcher(twister)
}
second = System.currentTimeMillis() -start
assert first>second*1.2


