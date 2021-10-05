package mathematics.combinations;

import mathematics.factorial.Factorial;

public class NCR {
    public long calculate(int n, int r) {
        Factorial factorial = new Factorial();

        //need to handle overflow (big integer - https://stackoverflow.com/questions/21724945/store-a-number-that-is-longer-than-type-long-in-java)
        return factorial.calculateMultiply(n) / (factorial.calculateMultiply(r) * factorial.calculateMultiply(n-r));
    }
}