package mathematics.reverse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseDigitsTest {
    @Test
    public void test1() {
        ReverseDigits rd = new ReverseDigits();
        assertEquals(2, rd.flip(200));
    }

    @Test
    public void test2() {
        ReverseDigits rd = new ReverseDigits();
        assertEquals(221, rd.flip(122));
    }

    @Test
    public void test3() {
        ReverseDigits rd = new ReverseDigits();
        assertEquals(173, rd.flip(371));
    }
}