package WilsonPrime;

import org.junit.Test;

import static org.junit.Assert.*;

public class WilsonPrimeTest {
    private WilsonPrime wilsonPrime;

    public WilsonPrimeTest() {
        wilsonPrime = new WilsonPrime();
    }

    @Test
    public void calculateFactorial(){
        assertEquals(24, wilsonPrime.calculateFactorial(4), 1);
    }

    @Test
    public void testZero(){
        assertFalse(wilsonPrime.amIWilson(0));
    }

    @Test
    public void testOne(){
        assertFalse(wilsonPrime.amIWilson(1));
    }

    @Test
    public void testFive(){
        assertTrue(wilsonPrime.amIWilson(5));
    }

}