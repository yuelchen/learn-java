class Solution {
    
    private Map<Integer, Integer> memoization = new HashMap<Integer, Integer>();
    
    public int climbStairs(int n) {
        
        if (n >= 2) {
            if(!memoization.containsKey(n)) {
                memoization.put(n, climbStairs(n-1) + climbStairs(n-2));
            }
            return memoization.get(n);
            
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return 0; 
        }
    }
}
