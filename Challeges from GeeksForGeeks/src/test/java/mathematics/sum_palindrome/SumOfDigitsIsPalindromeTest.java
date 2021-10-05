package mathematics.sum_palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsIsPalindromeTest {
    @Test
    public void test2() {
        SumOfDigitsIsPalindrome sodPalindrome = new SumOfDigitsIsPalindrome();
        assertTrue(sodPalindrome.isSumPalindrome(56));
    }

    @Test
    public void test1() {
        SumOfDigitsIsPalindrome sodPalindrome = new SumOfDigitsIsPalindrome();
        assertFalse(sodPalindrome.isSumPalindrome(98));
    }
}