class Solution {
    public boolean isPowerOfTwo(int n) {
        // keep dividing until you get a number smaller than 1 or 
        // n is no longer divisible by 2
        while((n % 2 == 0) && n > 1) {
            n /= 2;
        }

        return (n == 1);
    }
}
