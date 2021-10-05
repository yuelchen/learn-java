package mathematics.series;

public class GeometricProgression {
    public int calculate(int a1, int a2, int n) {
        int quotient = a2 / a1; //assumes a2 is always bigger than a1 and divisible by a1
        return (int) (a1 * Math.pow(quotient, n-1));
    }
}