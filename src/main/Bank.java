package main;

/**
 * Created by YuQiu on 09/01/15.
 */
public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
