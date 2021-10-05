package mathematics.armstrong;

public class ArmstrongNumber {
    public boolean isArmstrong(int num) {
        int original = num;
        int result = 0;

        do {
            int digit = num % 10;
            num = num / 10;
            result += (int) Math.pow(digit, 3);
        }
        while(num > 0);

        if(original == result) {
            return true;
        }
        else {
            return false;
        }
    }
}