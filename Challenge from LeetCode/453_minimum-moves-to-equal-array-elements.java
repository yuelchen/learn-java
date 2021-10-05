class Solution {
    public int minMoves(int[] nums) {
       
        int counter = 0;
        
        /*  Another approach is to count only the difference 
         *  for each value in array.
         *
         *  Example [200, 5, 8, 1]; 
         *  -   smallest = 1;
         *  -   counter += (200 - 1); counter is now 199
         *  -   counter += (5 - 1); counter is now 203
         *  -   counter += (8 - 1); counter is now 210
         *
         *  It takes 210 incrementations for all numbers to equal 211. 
         */
        if(nums.length > 0) {
            // find the smallest value
            int smallest = nums[0];
            for(int i=1; i<nums.length; i++) {
                if(smallest > nums[i]) {
                    smallest = nums[i];
                }
            }
            
            // increment count by the difference between number and smallest
            for(int i=0; i<nums.length; i++) {
                counter += (nums[i] - smallest);
            }
        }
        
        return counter;
    }
}
