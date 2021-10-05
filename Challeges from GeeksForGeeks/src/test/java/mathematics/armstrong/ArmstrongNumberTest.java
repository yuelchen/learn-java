package mathematics.armstrong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArmstrongNumberTest {
    //Armstrong Numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748

    @Test
    @DisplayName("Test 1: 370 is an Armstrong number")
    public void test1() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        assertTrue(armstrong.isArmstrong(370));
    }

    @Test
    @DisplayName("Test 2: 371 is an Armstrong number")
    public void test2() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        assertTrue(armstrong.isArmstrong(371));
    }

    @Test
    @DisplayName("Test 3: 372 is NOT an Armstrong number")
    public void test3() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        assertFalse(armstrong.isArmstrong(372));
    }
}