package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public class Money {

    protected int amount;
    protected String currency;

    public static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public Money times(int multiplier){
        return null;
    }

    public String currency() {
        return currency;
    }

    public String toString(){
        return amount + " " + currency;
    }

}
