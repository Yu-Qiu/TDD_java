package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public abstract class Money {

    protected int amount;

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public abstract Money times(int multiplier);

}
