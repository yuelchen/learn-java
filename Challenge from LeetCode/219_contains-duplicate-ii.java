class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> valueToIndexCache = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!valueToIndexCache.containsKey(nums[i])) {
                valueToIndexCache.put(nums[i], i);
            } else {
                int previousIndex = valueToIndexCache.get(nums[i]);
                int difference = i - previousIndex;                
                if(difference <= k) {
                    return true;
                } else {
                    valueToIndexCache.put(nums[i], i);
                }
            }
        }
        
        return false;
    }
}
