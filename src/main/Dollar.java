package main;

/**
 * Created by YuQiu on 06/01/15.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

}
