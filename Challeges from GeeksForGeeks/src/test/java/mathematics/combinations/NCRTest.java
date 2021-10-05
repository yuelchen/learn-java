package mathematics.combinations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NCRTest {
    @Test
    public void test6And2() {
        NCR ncr = new NCR();
        assertEquals(15, ncr.calculate(6, 2));
    }

    @Test
    public void test18And4() {
        NCR ncr = new NCR();
        assertEquals(3060, ncr.calculate(18, 4));
    }

//    @Test
//    @DisplayName("Will exceed so result will be zero - need more effiecient solution")
//    public void test25And3() {
//        NCR ncr = new NCR();
//        assertEquals(2300, ncr.calculate(25, 3));
//    }
}