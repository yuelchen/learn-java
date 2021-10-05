package mathematics.closest_number;

public class ClosestNumber {
    public int calculate(int number, int divisible) {
        if(number % divisible == 0) {
            return number;
        }
        else {
            int numAdd = this.getClosestAdd(number+1, divisible);
            int numSub = this.getClosestSub(number-1, divisible);
            return Math.abs(numAdd) > Math.abs(numSub) ? numAdd : numSub;
        }
    }

    private int getClosestAdd(int number, int divisible) {
        if(number % divisible == 0) {
            return number;
        }
        else {
            return this.getClosestAdd(number+1, divisible);
        }
    }

    private int getClosestSub(int number, int divisible) {
        if(number % divisible == 0) {
            return number;
        }
        else {
            return this.getClosestSub(number-1, divisible);
        }
    }
}