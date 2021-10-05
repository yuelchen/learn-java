class Solution {
    public String convertToBase7(int num) {
        
        // second parameter is radix (base you wish to convert to)
        return Integer.toString(num, 7);
    }
}
