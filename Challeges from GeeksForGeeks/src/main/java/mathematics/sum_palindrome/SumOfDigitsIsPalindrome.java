package mathematics.sum_palindrome;

import mathematics.reverse.ReverseDigits;

public class SumOfDigitsIsPalindrome {
    public boolean isSumPalindrome(int number) {
        int sum = this.getDigitSum(number);

        ReverseDigits rd = new ReverseDigits();
        int reverse = rd.flip(sum);

        return reverse == sum;
    }

    private int getDigitSum(int number) {
        int sum = 0;
        do {
            sum += number % 10;
            number = number / 10;
        }
        while(number > 0);

        return sum;
    }
}