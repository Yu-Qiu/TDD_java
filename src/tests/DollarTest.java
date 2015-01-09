package tests;

import main.Dollar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        Dollar product2 = five.times(3);
        assertEquals(15, product2.amount);
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}