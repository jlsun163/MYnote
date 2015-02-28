package personal.jili.overload

/**
 * Created by think on 2015/2/3.
 */
assert (~/..../).isCase('bear')

switch ('bear'){
    case ~/..../ : assert true; break
    default:      assert false

}
beasts =  ['bear','wolf','tiger','reges']
assert  beasts.grep(~/..../) == ['bear','wolf']