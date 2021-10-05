package mathematics.print_pattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintPatternTest {
    @Test
    public void test1() {
        PrintPattern pattern = new PrintPattern();
        assertEquals("1 $", pattern.print(1));
    }

    @Test
    public void test2() {
        PrintPattern pattern = new PrintPattern();
        assertEquals("2 2 1 1 $2 1 $", pattern.print(2));
    }

    @Test
    public void test3() {
        PrintPattern pattern = new PrintPattern();
        assertEquals("3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $", pattern.print(3));
    }
}