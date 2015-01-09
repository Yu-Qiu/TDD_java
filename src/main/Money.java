package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public class Money {

    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
