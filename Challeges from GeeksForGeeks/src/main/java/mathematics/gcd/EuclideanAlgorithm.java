package mathematics.gcd;

import java.util.Arrays;

public class EuclideanAlgorithm {
    public int calculateArray(int[] arr) {
        System.out.println("GCD Array for " + Arrays.toString(arr));
        int gcd = this.calculate(arr[0], arr[1]);
        System.out.println("\tgcd(" + arr[0] + ", " + arr[1] + ") is " + gcd);

        for(int i=2; i<arr.length; i++) {
            int temp = gcd;
            gcd = this.calculate(gcd, arr[i]);
            System.out.println("\tgcd(" +  temp + ", " + arr[i] + ") is " + gcd);
        }

        return gcd;
    }

    public int calculate(int number1, int number2) {
        if(number1 == 0) {
            return number2;
        }
        else if(number2 == 0) {
            return number1;
        }
        else if(number1 == number2) {
            return number1;
        }
        else if(number1 > number2) {
            return this.getResult(number1, number2);
        }
        else {
            return this.getResult(number2, number1);
        }
    }

    private int getResult(int high, int low) {
        int remainder = high % low;

        if(remainder == 0) {
            return low;
        }
        else {
            high = low;
            low = remainder;
            return this.getResult(high, low);
        }
    }
}
