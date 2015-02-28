package personal.jili.overload

/**
 * Created by think on 2015/2/3.
 */
myFairStringy = 'The rain in Spain stays mainly in the plain'

BOUNDS = /\b/
rhyme = /$BOUNDS\w*ain$BOUNDS/
found = ''
myFairStringy.eachMatch(rhyme){match ->
    found+= match[0]+' '
}
assert found == 'rain Spain plain'

found = ''
(myFairStringy =~rhyme).each {match ->
    found+=match + ' '
}
assert found == 'rain Spain plain'

cloze = myFairStringy.replaceAll(rhyme){it-'ain'+'____'}
assert cloze =='The r____ in Sp____ stays mainly in the pl____!'