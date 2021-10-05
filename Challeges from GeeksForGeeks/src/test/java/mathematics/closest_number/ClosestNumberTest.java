package mathematics.closest_number;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosestNumberTest {
    @Test
    @DisplayName("Test 1")
    public void test1() {
        ClosestNumber cn = new ClosestNumber();
        assertEquals(12, cn.calculate(12, 4));
    }

    @Test
    @DisplayName("Test 2")
    public void test2() {
        ClosestNumber cn = new ClosestNumber();
        assertEquals(-18, cn.calculate(-15, 6));
    }
}