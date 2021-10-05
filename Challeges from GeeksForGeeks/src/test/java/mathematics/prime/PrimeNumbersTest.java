package mathematics.prime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumbersTest {
    @Test
    public void testZero() {
        PrimeNumbers prime = new PrimeNumbers();
        assertFalse(prime.isPrime(0));
    }

    @Test
    public void testOne() {
        PrimeNumbers prime = new PrimeNumbers();
        assertFalse(prime.isPrime(1));
    }

    @Test
    public void testTwo() {
        PrimeNumbers prime = new PrimeNumbers();
        assertTrue(prime.isPrime(2));
    }

    @Test
    public void testDivisibleByTwo() {
        PrimeNumbers prime = new PrimeNumbers();
        assertFalse(prime.isPrime(4));
    }

    @Test
    public void testThree() {
        PrimeNumbers prime = new PrimeNumbers();
        assertTrue(prime.isPrime(3));
    }

    @Test
    public void testDivisibleByThreeSingleDigit() {
        PrimeNumbers prime = new PrimeNumbers();
        assertFalse(prime.isPrime(9));
    }

    @Test
    public void testDivisibleByThreeMultiDigit() {
        PrimeNumbers prime = new PrimeNumbers();
        assertFalse(prime.isPrime(186));
    }

    @Test
    public void testFive() {
        PrimeNumbers prime = new PrimeNumbers();
        assertTrue(prime.isPrime(5));
    }

    @Test
    public void testDivisibleByFiveEndZero() {
        PrimeNumbers prime = new PrimeNumbers();
        assertFalse(prime.isPrime(120));
    }

    @Test
    public void testDivisibleByFiveEndFive() {
        PrimeNumbers prime = new PrimeNumbers();
        assertFalse(prime.isPrime(105));
    }

    @Test
    public void testRandomNumbers1() {
        PrimeNumbers prime = new PrimeNumbers();
        assertTrue(prime.isPrime(43));
    }

    @Test
    public void testRandomNumbers2() {
        PrimeNumbers prime = new PrimeNumbers();
        assertTrue(prime.isPrime(991));
    }

    @Test
    public void testGreatestPrimeFactor6() {
        PrimeNumbers prime = new PrimeNumbers();
        assertEquals(3, prime.greatestPrimeFactor(6));
    }

    @Test
    public void testGreatestPrimeFactor15() {
        PrimeNumbers prime = new PrimeNumbers();
        assertEquals(5, prime.greatestPrimeFactor(15));
    }

    @Test
    public void testGreatestPrimeFactor151() {
        PrimeNumbers prime = new PrimeNumbers();
        assertEquals(151, prime.greatestPrimeFactor(151));
    }
}