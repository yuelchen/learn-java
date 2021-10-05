class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        /*  For each number, get the absolute value 
         *  (subtract 1 since arrays start at zero index).
         *  
         *  Then make the value negative if nums is greater than zero;
         *  this allows us to re-use the data for other indexes that will 
         *  be lost when overwriting value to simply -1.
         *
         *  Alternatively you can make a copy of the array and only modify 
         *  on copy while check original nums array; 
         *  this will lead to duplicate space (inefficient use of memory).
         */   
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }        
        
        /*  Loop through array and any value that is still positive 
         *  can be marked as missing.
         */
        List<Integer> missing = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                missing.add(i + 1);
            }
        }
        
        return missing;
    }
}
