package mathematics.gcd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanAlgorithmTest {
    @Test
    public void testHighLow() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(21, euclid.calculate(1071, 462));
    }

    @Test
    public void testLowHigh() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(14, euclid.calculate(42, 56));
    }

    @Test
    public void testCommonFactorEntry() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(144, euclid.calculate(144, 288));
    }

    @Test
    public void testSingleZeroEntry1() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(12, euclid.calculate(12, 0));
    }

    @Test
    public void testSingleZeroEntry2() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(9, euclid.calculate(0, 9));
    }

    @Test
    public void testDoubleZeroEntry() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(0, euclid.calculate(0, 0));
    }


    @Test
    public void testLowHighBigNumbers() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(18, euclid.calculate(461952, 116298));
    }

    @Test
    public void testHighLowLargeNumbers() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        assertEquals(32, euclid.calculate(314080416, 7966496));
    }

    @Test
    public void testGCDArray1() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        int[] array = { 5, 10 };
        assertEquals(5, euclid.calculateArray(array));
    }

    @Test
    public void testGCDArray2() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        int[] array = { 5, 10, 15, 20, 25, 100 };
        assertEquals(5, euclid.calculateArray(array));
    }

    @Test
    public void testGCDArray3() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        int[] array = { 68, 40, 1082, 782 };
        assertEquals(2, euclid.calculateArray(array));
    }

    @Test
    public void testGCDArray4() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        int[] array = { 69, 40, 1082, 782 };
        assertEquals(1, euclid.calculateArray(array));
    }

    @Test
    public void testGCDArray5() {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        int[] array = { 0, 40, 1082, 782 };
        assertEquals(2, euclid.calculateArray(array));
    }
}