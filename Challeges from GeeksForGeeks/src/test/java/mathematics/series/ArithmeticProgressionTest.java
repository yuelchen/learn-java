package mathematics.series;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticProgressionTest {
    @Test
    public void test1() {
        ArithmeticProgression ap = new ArithmeticProgression();
        assertEquals(5, ap.calculate(2, 3, 4));
    }

    @Test
    public void test2() {
        ArithmeticProgression ap = new ArithmeticProgression();
        assertEquals(10, ap.calculate(1, 2, 10));
    }

    @Test
    public void test3() {
        ArithmeticProgression ap = new ArithmeticProgression();
        assertEquals(28, ap.calculate(1, 4, 10));
    }

    @Test
    public void test4() {
        ArithmeticProgression ap = new ArithmeticProgression();
        assertEquals(20, ap.calculate(2, 4, 10));
    }
}