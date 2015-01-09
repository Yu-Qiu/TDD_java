package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public String currency() {
        return currency;
    }

}
