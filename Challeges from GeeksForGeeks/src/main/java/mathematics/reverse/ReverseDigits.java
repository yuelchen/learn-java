package mathematics.reverse;

public class ReverseDigits {
    public int flip(int number) {
        int result = 0;
        do {
            int digit = number % 10;
            number = number / 10;
            result = this.appendDigit(result, digit);
        }
        while(number > 0);

        return result;
    }

    private int appendDigit(int number, int digit) {
        return (number * 10) + digit;
    }
}