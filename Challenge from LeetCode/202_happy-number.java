class Solution {
    public boolean isHappy(int n) {
        
        List<Integer> cache = new ArrayList<Integer>();
        
        while(n != 1) {
            cache.add(n);
            n = getPowSum(n);
            
            if(cache.contains(n)) {
                return false;
            }
        }
        
        return true;
    }
    
    private int getPowSum(int n) {
        int sum = 0;
        
        int remainder = n % 10;
        int quotient = n / 10;
        
        if(quotient > 0) {
            sum += getPowSum(quotient);
        }
        
        if(remainder > 0) {
            sum += Math.pow(remainder, 2);
        }
        
        return sum;
    }
}
