package main;

/**
 * Created by YuQiu on 06/01/15.
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

<<<<<<< HEAD
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return currency;
=======
    public Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
>>>>>>> parent of 45b6ede... chapitre 8: creer Money.dollar et Money.franc
    }

}
