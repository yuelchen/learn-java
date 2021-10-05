class Solution {
    public int trailingZeroes(int n) {
        
        int counter = 0;
        for(int i = 5; n / i >= 1; i *= 5) {
            counter += n / i;
        }
        
        return counter;
    }
    
    //Good for small numbers but not feasible after past 20ish due to overflow
    private long getFactorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return (long) (n * getFactorial(n-1));
        }
    }
}
