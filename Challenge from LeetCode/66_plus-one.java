class Solution {
    public int[] plusOne(int[] digits) {
        
        int lastIndex = digits.length - 1;
        return incrementIndex(lastIndex, digits);
    }
    
    public int[] incrementIndex(int index, int[] digits) {
        if(digits[index]+1 <= 9) {
            digits[index] = digits[index] + 1;
            return digits;
        } else if(digits[index]+1 == 10 && index > 0) {
            digits[index] = 0;
            return incrementIndex(index-1, digits);
        } else {
            //digits[index]+1 == 10 && index == 0;
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for(int i=1; i<newDigits.length; i++) {
                newDigits[i] = 0;
            }
            return newDigits;
        }
    }
}
