package mathematics.fractions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FractionsTest {
    @Test
    public void add1() {
        Fractions fractions = new Fractions();
        assertEquals("3/500", fractions.addTwoFactions(1, 500, 2, 500));
    }

    @Test
    public void add2() {
        Fractions fractions = new Fractions();
        assertNotEquals("3/500", fractions.addTwoFactions(1, 250, 2, 500));
    }

    @Test
    public void add3() {
        Fractions fractions = new Fractions();
        assertEquals("22/500", fractions.addTwoFactions(10, 250, 2, 500));
    }
}