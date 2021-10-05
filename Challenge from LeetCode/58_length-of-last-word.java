class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int indexOfLastSpace = s.lastIndexOf(" ") + 1;
        if(indexOfLastSpace == -1) {
            return s.length();
        } else {
            return s.length() - indexOfLastSpace;
        }
    }
}
