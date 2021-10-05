class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int maxCount = 0;
        int currentCount = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                currentCount++;
            } else if(currentCount > 0) {
                maxCount = maxCount < currentCount ? currentCount : maxCount;
                currentCount = 0;
            }
        }
        
        // update max count in event last index in nums is 1
        maxCount = maxCount < currentCount ? currentCount : maxCount;
        
        return maxCount;
    }
}
