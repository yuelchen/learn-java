class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSoFar = nums[0];
        int maxHere = 0;
        for(int i=0; i<nums.length; i++) {
            maxHere += nums[i];
            if(maxSoFar <= maxHere) {
                maxSoFar = maxHere;
            }
            if(maxHere < 0) {
                maxHere = 0;
            }
        }
        
        return maxSoFar;
    }
}
