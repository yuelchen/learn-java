class Solution {
    public int singleNumber(int[] nums) {
        
        //List<Integer> numbers = new ArrayList<Integer>();
        
        //for(int i=0; i<nums.length; i++) {
        //    if(numbers.contains(Integer.valueOf(nums[i]))) {
        //        numbers.remove(Integer.valueOf(nums[i]));
        //    } else {
        //        numbers.add(nums[i]);
        //    }
        //}
        
        //return numbers.get(0);
        
        int bitwise = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            // Binary XOR Operator copies the bit if it is set in one operand but not both.
            bitwise ^= nums[i];
        }
        
        //only the one whose didn't meet xor
        return bitwise;
    }
}
