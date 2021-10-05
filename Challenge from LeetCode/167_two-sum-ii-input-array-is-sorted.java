class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sumIndex = new int[2];
        
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;
        while(firstIndex < lastIndex) {
            if(numbers[firstIndex] + numbers[lastIndex] > target) {
                lastIndex--;
            } else if(numbers[firstIndex] + numbers[lastIndex] < target) {
                firstIndex++;
            } else {
                sumIndex[0] = firstIndex + 1; 
                sumIndex[1] = lastIndex + 1;
                firstIndex = lastIndex;
            }
        }
        
        return sumIndex;
    }
}
