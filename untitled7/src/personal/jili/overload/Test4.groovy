package personal.jili.overload

import java.util.regex.Matcher

/**
 * Created by think on 2015/2/2.
 */
twister = 'she sells sea shells at the sea shore of seychelles'

assert twister =~ /s.a/

finder = (twister =~ /s.a/)
assert finder instanceof Matcher

assert twister ==~ /(\w+\w+)*/

WORD = /\w+/
matches = (twister ==~/($WORD $WORD)*/)
assert  matches instanceof Boolean

assert (twister ==~ /s.e/) ==false

assert (twister ==~ /s.e/) == false

wordsByX = twister.replaceAll(WORD,'x')
assert wordsByX =='x x x x x x x x '

words = twister.split(/ /)
assert words.size() == 10
assert words[] == 'she'


