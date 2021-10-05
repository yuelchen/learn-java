class Solution {
    public boolean isPalindrome(int x) {
    
        boolean result = false;
        int original = x;
        
        if (original == 0) {
            result = true;
        } else if(x > 0) {
            int reverse = 0;
            while (x != 0) {
                reverse = (reverse * 10) + (x % 10);
                x = x / 10;
            }
            
            if(reverse == original) {
                result = true;
            }
        }
        
        return result;
    }
}
