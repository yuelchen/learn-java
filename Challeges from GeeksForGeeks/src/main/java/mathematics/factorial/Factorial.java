package mathematics.factorial;

public class Factorial {
    public int calculateAdd(int number) {
        if(number <= 1) {
            return number;
        }
        else {
            return number + this.calculateAdd(number - 1);
        }
    }

    public long calculateMultiply(int number) {
        if(number <= 1) {
            return number;
        }
        else {
            return number * this.calculateMultiply(number - 1);
        }
    }
}