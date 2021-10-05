package mathematics.series;

public class ArithmeticProgression {
    public int calculate(int a1, int a2, int n) {
        int d = a2 - a1; //assumes a2 is always bigger than a1
        return a1 + (n - 1) * d;
    }
}