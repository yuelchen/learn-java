class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++) {
            nums1[m+i] = nums2[i];
        }
        
        sort(nums1);
    }
    
    public void sort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<array.length; j++) {
                smallest = array[j] < array[smallest] ? j : smallest;
            }
            
            if(i != smallest) {
                int temp = array[smallest];
                array[smallest] = array[i];
                array[i] = temp;
            }
        }
    }
}
