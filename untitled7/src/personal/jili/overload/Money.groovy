package personal.jili.overload

/**
 * Created by think on 2015/2/2.
 */
class Money {
    private int amout
    private  String currency
    Money(amountValue,currencyValue){
        amout = amountValue
        currency = currencyValue
    }
    boolean  equals(Object other){
        if(null == other)  return  false
        if (!(other instanceof Money)) return false
        if (currency!=other.currency) return false
        if (amout != other.amout) return false
        return true
    }
    int hashCode(){
        amout.hashCode()+currency.hashCode()
    }
    Money plus (Money other){
        if(null ==other) return  null
        if(other.currency!=currency){
            throw new IllegalArgumentException(
                    "cannot add $other.currency to $currency")
        }
        return new Money(amout+other.amout,currency)
    }

}
