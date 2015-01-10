package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);

}
