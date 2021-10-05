class Solution {
    public int majorityElement(int[] nums) {
        
        //Below commented out section is for when majority element is not guaranteed
        //for(int i=0; i<nums.length; i++) {
        //    int indexCount = 0;
        //    for(int j=0; j<nums.length; j++) {
        //        if(nums[i] == nums[j]) {
        //            indexCount++;
        //        }
        //    }
        //    
        //    if(indexCount > (nums.length / 2)) {
        //        return nums[i];
        //    }
        //}
        //
        //return -1;
        
        Map<Integer, Integer> mapping = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(mapping.containsKey(nums[i])) {
                int currentCount = mapping.get(new Integer(nums[i]));
                if(currentCount + 1 > (nums.length / 2)) {
                    return nums[i];
                } else {
                    mapping.put(new Integer(nums[i]), currentCount + 1);
                }
            } else {
                mapping.put(new Integer(nums[i]), 1);
            }
        }
        
        //handles test case [1]
        int highestCount = 0;
        int highestKey = 0;
        for(Map.Entry<Integer, Integer> map : mapping.entrySet()) {
            if(map.getValue() > highestCount) {
                highestCount = map.getValue();
                highestKey = map.getKey();
            }
        }
        
        return highestKey;
    }
}
