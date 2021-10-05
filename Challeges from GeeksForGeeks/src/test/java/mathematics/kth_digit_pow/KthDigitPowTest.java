package mathematics.kth_digit_pow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KthDigitPowTest {
    @Test
    public void test3To3FirstDigitLeft() {
        KthDigitPow kdp = new KthDigitPow();
        assertEquals(2, kdp.getPowDigitFromLeft(3, 3, 1));
    }

    @Test
    public void test3To3FirstDigitRight() {
        KthDigitPow kdp = new KthDigitPow();
        assertEquals(7, kdp.getPowDigitFromRight(3, 3, 1));
    }

    @Test
    public void test3To3SecondDigitLeft() {
        KthDigitPow kdp = new KthDigitPow();
        assertEquals(7, kdp.getPowDigitFromLeft(3, 3, 2));
    }

    @Test
    public void test3To3SecondDigitRight() {
        KthDigitPow kdp = new KthDigitPow();
        assertEquals(2, kdp.getPowDigitFromRight(3, 3, 2));
    }

    @Test
    public void test5To2SecondDigitLeft() {
        KthDigitPow kdp = new KthDigitPow();
        assertEquals(5, kdp.getPowDigitFromLeft(5, 2, 2));
    }

    @Test
    public void test5To2SecondDigitRight() {
        KthDigitPow kdp = new KthDigitPow();
        assertEquals(2, kdp.getPowDigitFromRight(5, 2, 2));
    }
}