package main;

import java.util.Hashtable;

/**
 * Created by YuQiu on 09/01/15.
 */
public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate= (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

    private Hashtable rates= new Hashtable();

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }
}
