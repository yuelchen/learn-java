package mathematics.permutation;

import mathematics.factorial.Factorial;

public class NPR {
    public long calculate(int n, int r) {
        Factorial factorial = new Factorial();
        return factorial.calculateMultiply(n) / factorial.calculateMultiply(n - r);
    }
}