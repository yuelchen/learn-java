class Solution {
    public boolean isPalindrome(String s) {
        
        String pattern = "^[a-zA-Z0-9]*$";
        String[] sArray = s.split("", s.length());
        
        int start = 0;
        int end = sArray.length - 1;
        boolean palindrome = true;
        while(start <= end && palindrome) {
            if(!sArray[start].matches(pattern)) {
                start++;
            } else if(!sArray[end].matches(pattern)) {
                end--;
            } else if (sArray[start].equalsIgnoreCase(sArray[end])) {
                start++;
                end--;
            } else {
                palindrome = false;
            }
        }
        
        return palindrome;
    }
}
