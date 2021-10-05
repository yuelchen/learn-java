package mathematics.binary_to_decimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryToDecimalTest {
    @Test
    @DisplayName("Test 1: Binary number 10001000 equals to 136")
    public void test1() {
        BinaryToDecimal btd = new BinaryToDecimal();
        assertEquals(136, btd.calculate(10001000));
    }

    @Test
    @DisplayName("Test 2: Binary number 101100 equals to 44")
    public void test2() {
        BinaryToDecimal btd = new BinaryToDecimal();
        assertEquals(44, btd.calculate(101100));
    }
}