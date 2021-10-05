class Solution {
    
    private int[] memo = new int[30];
    
    public int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
            
        } else {
            
            if(memo[n-1] == 0) {
                memo[n-1] = fib(n-1);
            }
            
            if(memo[n-2] == 0) {
                memo[n-2] = fib(n-2);
            }
            
            return memo[n-1] + memo[n-2];
        }
    }
}
