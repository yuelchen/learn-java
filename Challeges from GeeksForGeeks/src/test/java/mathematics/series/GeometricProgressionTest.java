package mathematics.series;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricProgressionTest {
    @Test
    public void test1() {
        GeometricProgression gp = new GeometricProgression();
        assertEquals(2, gp.calculate(2, 3, 1));
    }

    @Test
    public void test2() {
        GeometricProgression gp = new GeometricProgression();
        assertEquals(2, gp.calculate(1, 2, 2));
    }

    @Test
    public void test3() {
        GeometricProgression gp = new GeometricProgression();
        assertEquals(2187, gp.calculate(1, 3, 8));
    }
}