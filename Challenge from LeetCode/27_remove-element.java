class Solution {
    public int removeElement(int[] nums, int val) {
        
        int lastIndex = nums.length - 1;
        for(int i=0; i<=lastIndex; i++) {
            if(nums[i] == val) {
                lastIndex = getLastIndex(i, lastIndex, nums, val);
                nums[i] = nums[lastIndex];
                nums[lastIndex] = 0;
                lastIndex--;
            }
        }
        
        return lastIndex+1;
    }
    
    private int getLastIndex(int i, int lastIndex, int[] nums, int val) {
        if(nums[lastIndex] == val && lastIndex > i) {
            return getLastIndex(i, lastIndex-1, nums, val);
        } else if(nums[lastIndex] == val && lastIndex <= i) {
            return i;
        } else {
            return lastIndex;
        }
    }
}
