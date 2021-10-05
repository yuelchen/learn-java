class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        /*  A string with repeating substring should hold true if 
         *  string is doubled. 
         *
         *  We double it and shift over a single index to check for any matches.
         *
         *  If the next match equals length of s, then we did not find any substring.
         *  If the index is not equal, then we found a match before end.
         *
         *  Example:
         *  String s = leetcode
         *  String larger = leetcodeleetCode
         *  int index = 8 
         */
        String doubleString = s + s;
        int index = doubleString.indexOf(s, 1);
        
        return doubleString.indexOf(s, 1) != s.length();
    }
}
