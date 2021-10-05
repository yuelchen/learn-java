class Solution {
    static String commonPrefix(String str1, String str2) {
    
        int shortestLength;
        String prefix = "";
        
        if str1.length() > str2.length()) {
            shortestLength = str2.length();
        } else {
            shortestLength = str1.length();
        }
        
        for (int i=0;i<shortestLength;i++) {
            Character char1 = new Character(str1.charAt(i));
            Character char2 = new Character(str2.charAt(i));
            
            if (char1.equals(char2)) {
                prefix += str1.charAt(i);
            } else break;
        }
        
        return prefix;
    }
    
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        
        if (strs.length == 1) {
            result = strs[0];
        } else if (strs.length >= 2) {
            result = commonPrefix(strs[0], strs[1]);
            for (int i=2;i<strs.length;i++) {
                result = commonPrefix(result, strs[i]);
            }
        }
        
        return result;
    }
}
