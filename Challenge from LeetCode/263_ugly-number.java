class Solution {
    public boolean isUgly(int num) {
        
        if(num < 1) {
            // Ugly numbers are always positive (1 or greater)
            return false; 
            
        } else {
            // Otherwise keep dividing with 2, 3, 5 until number == 1 (is ugly);
            // or if unable to divide, return false as it's not ugly (i.e. 7 when num = 14)
            while(num > 1) {
                if(num % 2 == 0) {
                    num /= 2;
                } else if(num % 3 == 0) {
                    num /= 3;
                } else if(num % 5 == 0) {
                    num /= 5;
                } else {
                    return false;
                }
            }

            return true;
        }
    }
}
