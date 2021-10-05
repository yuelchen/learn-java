package mathematics.lcm;

import mathematics.gcd.EuclideanAlgorithm;

public class LCM {
    public int calculate(int number1, int number2) {
        EuclideanAlgorithm euclid = new EuclideanAlgorithm();
        int gcd = euclid.calculate(number1, number2);

        if(number1 == 0 || number2 ==0) {
            return 0;
        }
        else if(gcd == 0) {
            return number1 * number2;
        }
        else {
            return (number1 * number2) / gcd;
        }
    }
}
