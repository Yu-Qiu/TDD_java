package main;

/**
 * Created by YuQiu on 06/01/15.
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public String currency() {
        return currency;
    }

}
