package mathematics.lcm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCMTest {
    @Test
    public void testLowHigh() {
        LCM lcm = new LCM();
        assertEquals(12, lcm.calculate(4, 6));
    }

    @Test
    public void testHighLow() {
        LCM lcm = new LCM();
        assertEquals(30, lcm.calculate(15, 6));
    }

    @Test
    public void testDuplicate() {
        LCM lcm = new LCM();
        assertEquals(19, lcm.calculate(19, 19));
    }

    @Test
    public void testSingleZeroEntry1() {
        LCM lcm = new LCM();
        assertEquals(0, lcm.calculate(19, 0));
    }

    @Test
    public void testSingleZeroEntry2() {
        LCM lcm = new LCM();
        assertEquals(0, lcm.calculate(0, 20));
    }

    @Test
    public void testDoubleZeroEntry() {
        LCM lcm = new LCM();
        assertEquals(0, lcm.calculate(0, 0));
    }
}