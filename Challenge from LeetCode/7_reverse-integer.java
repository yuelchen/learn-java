class Solution {
    public int reverse(int x) {
        
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = Math.abs(x);
        }
        
        int reverse = 0;
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            if (reverse % 10 != x % 10) {
                x = 0;
                reverse = 0;
            } else {
                x = x / 10;
            }
        }
        
        if (negative) {
            reverse = 0 - reverse;
        }
        
        return reverse;
    }
}
