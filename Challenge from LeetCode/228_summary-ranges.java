class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<String>();
        if(nums.length == 1) {
            ranges.add(getRangeString(nums[0], nums[0]));
        } else if(nums.length > 1) {
            int rangeStart = nums[0];
            int expectedNext = rangeStart + 1;
            int lastRange = nums[nums.length - 1];
            
            for(int i=1; i<nums.length; i++) {
                if(nums[i] != expectedNext) {
                    ranges.add(getRangeString(rangeStart, nums[i-1]));
                    rangeStart = nums[i];
                    expectedNext = rangeStart + 1;
                } else {
                    expectedNext++;
                }
                
                if(nums[i] == lastRange) {
                    ranges.add(getRangeString(rangeStart, nums[i]));
                }
            }
        }
        
        return ranges;
    }
    
    private String getRangeString(int a, int b) {
        if(a != b) {
            return String.format("%d->%d", a, b);
        } else {
            return Integer.toString(a);
        }
    }
}
