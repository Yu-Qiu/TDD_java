package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public class Sum implements Expression{
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend){
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to){
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
