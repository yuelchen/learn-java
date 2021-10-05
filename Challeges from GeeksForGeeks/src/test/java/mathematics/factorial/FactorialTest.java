package mathematics.factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    public void testFactorialAdd1() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateAdd(1));
    }

    @Test
    public void testFactorialAdd5() {
        Factorial factorial = new Factorial();
        assertEquals(15, factorial.calculateAdd(5));
    }

    @Test
    public void testFactorialMultiply5() {
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.calculateMultiply(5));
    }

    @Test
    public void testFactorialMultiply1() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateMultiply(1));
    }

    @Test
    public void testFactorialMultiply4() {
        Factorial factorial = new Factorial();
        assertEquals(24, factorial.calculateMultiply(4));
    }
}