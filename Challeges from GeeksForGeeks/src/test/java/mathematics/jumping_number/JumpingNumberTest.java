package mathematics.jumping_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class JumpingNumberTest {
    @Test
    public void testFindJumping10() {
        JumpingNumber jn = new JumpingNumber();
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", jn.find(10));
    }

    @Test
    public void testFindJumping50() {
        JumpingNumber jn = new JumpingNumber();
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 12 21 23 32 34 43 45", jn.find(50));
    }

    @Test
    public void testIsJumpingZero() {
        JumpingNumber jn = new JumpingNumber();
        assertTrue(jn.isJumping(0));
    }

    @Test
    public void testIsJumpingSingle() {
        JumpingNumber jn = new JumpingNumber();
        assertTrue(jn.isJumping(8));
    }

    @Test
    public void testIsJumping8987() {
        JumpingNumber jn = new JumpingNumber();
        assertTrue(jn.isJumping(8987));
    }

    @Test
    public void testIsJumping4343456() {
        JumpingNumber jn = new JumpingNumber();
        assertTrue(jn.isJumping(4343456));
    }

    @Test
    public void testIsJumping796() {
        JumpingNumber jn = new JumpingNumber();
        assertFalse(jn.isJumping(796));
    }

    @Test
    public void testIsJumping89098() {
        JumpingNumber jn = new JumpingNumber();
        assertFalse(jn.isJumping(89098));
    }
}