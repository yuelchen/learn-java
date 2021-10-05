package mathematics.permutation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NPRTest {
    @Test
    public void test4And3() {
        NPR npr = new NPR();
        assertEquals(24, npr.calculate(4, 3));
    }

    @Test
    public void test12And3() {
        NPR npr = new NPR();
        assertEquals(1320 , npr.calculate(12, 3));
    }

    @Test
    public void test10And5() {
        NPR npr = new NPR();
        assertEquals(30240 , npr.calculate(10, 5));
    }
}