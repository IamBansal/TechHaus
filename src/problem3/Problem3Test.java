package problem3;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem3Test {

    @Test
    public void testisPrimeFunction() {
        assertTrue(Problem3.isPrime(2));
        assertTrue(Problem3.isPrime(3));
        assertFalse(Problem3.isPrime(4));
        assertTrue(Problem3.isPrime(5));
        assertFalse(Problem3.isPrime(6));
        assertTrue(Problem3.isPrime(7));
        assertFalse(Problem3.isPrime(8));
        assertFalse(Problem3.isPrime(9));
        assertFalse(Problem3.isPrime(10));
        assertTrue(Problem3.isPrime(11));
    }
}
