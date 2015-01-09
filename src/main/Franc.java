package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

<<<<<<< HEAD
    public Money times(int multiplier){
        return new Franc (amount * multiplier, currency);
    }

    public String currency() {
        return currency;
=======
    public Franc times(int multiplier){
        return new Franc(amount*multiplier);
>>>>>>> parent of 45b6ede... chapitre 8: creer Money.dollar et Money.franc
    }

}
