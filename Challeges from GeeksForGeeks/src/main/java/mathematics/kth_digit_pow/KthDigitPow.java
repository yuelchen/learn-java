package mathematics.kth_digit_pow;

public class KthDigitPow {
    public int getPowDigitFromLeft(int number, int power, int index) {
        int p = (int) Math.pow(number, power);

        String[] digits = Integer.toString(p).split("");
        return Integer.parseInt(digits[index-1]); //does catch out of bound input
    }

    public int getPowDigitFromRight(int number, int power, int index) {
        int p = (int) Math.pow(number, power);

        String[] digits = Integer.toString(p).split("");
        int digitsLen = digits.length;
        return Integer.parseInt(digits[digitsLen-index]); //does catch out of bound input
    }
}